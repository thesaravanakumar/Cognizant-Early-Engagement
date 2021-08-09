package com.model;

import org.springframework.stereotype.Component;

@Component
public class HelperBean {
	private String serviceType;
	private float serviceCostPerHour;
	private int noOfHours;

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public float getServiceCostPerHour() {
		return serviceCostPerHour;
	}

	public void setServiceCostPerHour(float serviceCostPerHour) {
		this.serviceCostPerHour = serviceCostPerHour;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
}
