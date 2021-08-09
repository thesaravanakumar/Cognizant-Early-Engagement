package project;

public class Employee {
	private String employeeId;
	private String employeeName;
	private String emailId;
	private String designation;

	public Employee(String employeeId, String employeeName, String emailId, String designation) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.designation = designation;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", designation=" + designation + "]";
	}
}
