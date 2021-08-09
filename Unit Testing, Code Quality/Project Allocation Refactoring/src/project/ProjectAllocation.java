package project;

import java.util.Date;

public class ProjectAllocation {
	private Employee employee;
	private Project project;
	private int projectAllocationId;
	private String moduleName;
	private static final int NO_OF_PROJECTS_WORKING_IN_PARALLEL = 0;
	private Date allocationDate;
	private static final int NO_OF_HOURS_ALLOCATED = 160;

	public ProjectAllocation(Employee employee, Project project, int projectAllocationId, String moduleName,
			Date allocationDate) {
		this.employee = employee;
		this.project = project;
		this.projectAllocationId = projectAllocationId;
		this.moduleName = moduleName;
		this.allocationDate = allocationDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getProjectAllocationId() {
		return projectAllocationId;
	}

	public void setProjectAllocationId(int projectAllocationId) {
		this.projectAllocationId = projectAllocationId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Date getAllocationDate() {
		return allocationDate;
	}

	public void setAllocationDate(Date allocationDate) {
		this.allocationDate = allocationDate;
	}

	public static int getNoOfProjectsWorkingInParallel() {
		return NO_OF_PROJECTS_WORKING_IN_PARALLEL;
	}

	public static int getNoOfHoursAllocated() {
		return NO_OF_HOURS_ALLOCATED;
	}

	@Override
	public String toString() {
		return "ProjectAllocation [employee=" + employee + ", project=" + project + ", projectAllocationId="
				+ projectAllocationId + ", moduleName=" + moduleName + ", allocationDate=" + allocationDate + "]";
	}
}
