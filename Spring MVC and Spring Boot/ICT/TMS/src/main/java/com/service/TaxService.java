package com.service;

import org.springframework.stereotype.Service;

import com.model.UserClaim;

@Service
public interface TaxService {
	/**
	 * Calculate Tax
	 * 
	 * @param userClaim UserClaim bean
	 * @return Calculated tax
	 */
	public double calculateTax(UserClaim userClaim);
}
