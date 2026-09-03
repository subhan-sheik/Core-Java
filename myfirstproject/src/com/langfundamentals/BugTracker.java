package com.langfundamentals;

public class BugTracker {
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	int getBugId() {
		return bugId;
	}

	String getApplicationName() {
		return applicationName;
	}

	String getBugTitle() {
		return bugTitle;
	}

	String getSeverity() {
		return severity;
	}

	String getPriority() {
		return priority;
	}

	String getStatus() {
		return status;
	}

	String getAssignedDeveloper() {
		return assignedDeveloper;
	}

	void assignToDeveloper(int bugId, String developerName) {
		if(this.bugId==bugId) {
		this.assignedDeveloper = developerName;
		updateStatus("In Development");
		}
	}

	void updateStatus(String newStatus) {
		this.status = newStatus;
	}

	void displayBugSummary() {
		System.out.println("Bug ID :" + getBugId());
		System.out.println("Application Name :" + getApplicationName());
		System.out.println("Bug Title :" + getBugTitle());
		System.out.println("Severity :" + getSeverity());
		System.out.println("Priority :" + getPriority());
		System.out.println("Status :" + getStatus());
		System.out.println("Assign Developer Name :" + getAssignedDeveloper());
	}

	public static void main(String[] args) {
		BugTracker b = new BugTracker();
		b.bugId = 101;
		b.applicationName = "Banking Application";
		b.bugTitle = "Login button not working";
		b.severity = "High";
		b.priority = "High";
		b.status = "open";
		b.assignedDeveloper = "Not Assigned";
		System.out.println("-------------BUG Tracker-----------------");
		b.displayBugSummary();
		System.out.println("\n------------BUG Tracker After Assignment------------");
		b.assignToDeveloper(101, "subhan");
		b.displayBugSummary();
	}

}
