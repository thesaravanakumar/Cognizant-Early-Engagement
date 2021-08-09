package com.service;

import org.springframework.stereotype.Service;

import com.model.HelperBean;

@Service
public class HelperService {
	public double calculateTotalCost(HelperBean helperBean) {
		String serviceType = helperBean.getServiceType();
		int noOfHours = helperBean.getNoOfHours();
		float costPerHour = 0.0f;
		
		if (serviceType.equals("ACService")) {
			costPerHour = 400.0f;
		} else if (serviceType.equals("WashingMachineService")) {
			costPerHour = 500.0f;
		} else if (serviceType.equals("RefrigeratorService")) {
			costPerHour = 300.0f;
		}
		
		helperBean.setServiceCostPerHour(costPerHour);
		
		return noOfHours * costPerHour;
	}
}
