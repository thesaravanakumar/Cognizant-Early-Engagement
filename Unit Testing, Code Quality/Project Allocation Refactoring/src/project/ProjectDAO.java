package project;

import java.util.ArrayList;
import java.util.List;

public class ProjectDAO {
	private final List<Project> projectList = new ArrayList<>();

	public void addProject(Project project) {
		projectList.add(project);
	}

	public void removeProject(Project project) {
		projectList.remove(project);
	}

	public void viewProject() {
		for (Project project : projectList) {
			System.out.println("Project Id:" + project.getProjectId());
			System.out.println("Project Name:" + project.getProjectName());
			System.out.println("Project Manager Name:" + project.getProjectManagerName());
			System.out.println("Duration:" + project.getDuration());
			System.out.println("Start Date:" + project.getStartDate());
			System.out.println("End Date:" + project.getEndDate());
		}
	}
}
