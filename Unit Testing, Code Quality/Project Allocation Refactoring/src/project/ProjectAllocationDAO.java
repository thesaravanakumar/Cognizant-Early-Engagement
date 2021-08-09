package project;

import java.util.ArrayList;
import java.util.List;

public class ProjectAllocationDAO {
	private final List<ProjectAllocation> projectAllocationList = new ArrayList<>();

	public void addProjectAllocation(ProjectAllocation projectAllocation) {
		projectAllocationList.add(projectAllocation);
	}

	public void removeProjectAllocation(ProjectAllocation projectAllocation) {
		projectAllocationList.remove(projectAllocation);
	}

	public void viewProjectAllocation() {
		if (projectAllocationList.isEmpty()) {
			System.out.println("Project Allocation List is empty");
		} else {
			for (ProjectAllocation projectAllocation : projectAllocationList) {
				System.out.println("Project Allocation Id:" + projectAllocation.getProjectAllocationId());
				System.out.println("Project Id:" + projectAllocation.getProject().getProjectId());
				System.out.println("Employee Id:" + projectAllocation.getEmployee().getEmployeeId());
				System.out.println("Allocation Date:" + projectAllocation.getAllocationDate());
				System.out.println("Module Name:" + projectAllocation.getModuleName());
			}
		}
	}
}
