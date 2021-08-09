package com.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;

import com.model.HelperBean;
import com.service.HelperService;

@Controller
public class HelpController {
	@Autowired
	private HelperService helpService;

	@ModelAttribute("serviceList")
	public Map<String, String> buildState() {
		Map<String, String> pairs = new HashMap<>();
		pairs.put("ACService", "ACService");
		pairs.put("WashingMachineService", "WashingMachineService");
		pairs.put("RefrigeratorService", "RefrigeratorService");
		
		return pairs;
	}

	@RequestMapping(value = "/helpDesk", method = RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("helper") HelperBean helperBean, ModelMap model) {
		double totalCost = helpService.calculateTotalCost(helperBean);
		model.put("cost", totalCost);

		return "helpdesk";
	}

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("helper") HelperBean helperBean) {
		return "showpage";
	}
}