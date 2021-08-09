package project;

public class Project {
	private String projectId;
	private String projectName;
	private String projectManagerName;
	private int duration;
	private String startDate;
	private String endDate;

	public Project(String projectId, String projectName, String projectManagerName, int duration, String startDate,
			String endDate) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectManagerName = projectManagerName;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectManagerName() {
		return projectManagerName;
	}

	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectManagerName="
				+ projectManagerName + ", duration=" + duration + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}
}
