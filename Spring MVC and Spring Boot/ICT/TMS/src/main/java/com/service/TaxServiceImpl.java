package com.service;

import org.springframework.stereotype.Service;

import com.model.UserClaim;

@Service
public class TaxServiceImpl implements TaxService {
	/**
	 * Calculate the tax according to the srs
	 * 
	 * @param userClaim UserClaim component to get the values
	 * @return Calculated tax
	 */
	@Override
	public double calculateTax(UserClaim userClaim) {
		String e = userClaim.getExpenseType();
		double a = userClaim.getExpenseAmt();
		double t = 0.0;

		if (e.startsWith("M")) {
			if (a <= 1000) {
				t = 15.0;
			} else if (a > 1000 && a <= 10000) {
				t = 20.0;
			} else if (a > 10000) {
				t = 25.0;
			}
		} else if (e.startsWith("T")) {
			if (a <= 1000) {
				t = 10.0;
			} else if (a > 1000 && a <= 10000) {
				t = 15.0;
			} else if (a > 10000) {
				t = 20.0;
			}
		} else if (e.startsWith("F")) {
			if (a <= 1000) {
				t = 5.0;
			} else if (a > 1000 && a <= 10000) {
				t = 10.0;
			} else if (a > 10000) {
				t = 15.0;
			}
		}

		return a * (t / 100.0);
	}
}
