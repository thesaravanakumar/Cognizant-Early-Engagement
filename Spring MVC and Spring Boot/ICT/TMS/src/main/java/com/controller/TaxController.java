package com.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.UserClaim;
import com.service.TaxService;

@Controller
public class TaxController {
	@Autowired
	public TaxService taxService;

	/**
	 * Display taxclaim.jsp page when a get request is pushed on url
	 * /getTaxClaimFormPage
	 * 
	 * @param userClaim Is the UserClaim component
	 * @return taxclaim as a jsp page
	 * @see UserClaim
	 */
	@RequestMapping(value = "/getTaxClaimFormPage", method = RequestMethod.GET)
	public String claimPage(@ModelAttribute("userClaim") UserClaim userClaim) {
		return "taxclaim";
	}

	/**
	 * Return result.jsp age when validation is successful Otherwise return back to
	 * taxclaim page with error message
	 * 
	 * @param userClaim UserClaim component
	 * @param result    BindingResult which validate the user input
	 * @param map       ModelMap to put attribute which will be forwarded to next
	 *                  page
	 * @return "result.jsp" page if the validation is successful otherwise
	 *         "taxclaim.jsp" with error included
	 */
	@RequestMapping(value = "/calculateTax", method = RequestMethod.GET)
	public String calculateTax(@Valid @ModelAttribute("userClaim") UserClaim userClaim, BindingResult result,
			ModelMap map) {
		if (result.hasErrors()) {
			return "taxclaim";
		}

		double amount = taxService.calculateTax(userClaim);
		map.addAttribute("amount", amount);

		return "result";
	}

	/**
	 * Populate <form:select /> tag in the taxclaim.jsp page
	 * 
	 * @return List of expenses
	 */
	@ModelAttribute("expenseList")
	public List<String> populateExpense() {
		return Arrays.asList("MedicalExpense", "TravelExpense", "FoodExpense");
	}
}
