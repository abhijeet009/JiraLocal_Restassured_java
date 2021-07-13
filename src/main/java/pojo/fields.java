package pojo;

import java.util.List;

public class fields {
	private project project;
	private String summary;
	private issuetype issuetype;
	private assignee assignee;
	private reporter reporter;
	private priority priority;
	private List<String> labels;

	private String description;
	public project getProject() {
		return project;
	}
	public void setProject(project project) {
		this.project = project;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public issuetype getIssuetype() {
		return issuetype;
	}
	public void setIssuetype(issuetype issuetype) {
		this.issuetype = issuetype;
	}
	public assignee getAssignee() {
		return assignee;
	}
	public void setAssignee(assignee assignee) {
		this.assignee = assignee;
	}
	public reporter getReporter() {
		return reporter;
	}
	public void setReporter(reporter reporter) {
		this.reporter = reporter;
	}
	public priority getPriority() {
		return priority;
	}
	public void setPriority(priority priority) {
		this.priority = priority;
	}
	public List<String> getLabels() {
		return labels;
	}
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	/*{
	   "fields":{
	      "project":{
	         "id":"10000"
	      },
	      "summary":"something's wrong",
	      "issuetype":{
	         "id":"10000"
	      },
	      "assignee":{
	         "name":"homer"
	      },
	      "reporter":{
	         "name":"smithers"
	      },
	      "priority":{
	         "id":"20000"
	      },
	      "labels":[
	         "bugfix",
	         "blitz_test"
	      ],
	    
	      
	      "description":"description"
	   }
	}*/

}
