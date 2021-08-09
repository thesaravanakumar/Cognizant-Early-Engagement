package com.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class UserClaim {
	private String expenseType;
	@PositiveOrZero(message = "{error.expenseAmount.negative}")
	private double expenseAmt;
	@NotBlank(message = "{error.employeeId}")
	@Size(min = 5, message = "{error.employeeId.size}")
	private String employeeId;

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public double getExpenseAmt() {
		return expenseAmt;
	}

	public void setExpenseAmt(double expenseAmt) {
		this.expenseAmt = expenseAmt;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}
