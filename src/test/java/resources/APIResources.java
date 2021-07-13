package resources;

public enum APIResources {
	// Project
	Getallprojects("rest/api/2/project"), // get
	Createproject("rest/api/2/project"), // post

	// Users
	Createuser("rest/api/2/user"), // post
	Loginuser("rest/auth/1/session"), //post
	// issues
	Createissue("rest/api/2/issue"), // post
	Getissue("rest/api/2/issue/{issueIdOrKey}"), // get
	Editissue("rest/api/2/issue/{issueIdOrKey}"), // PUT
	Addcomment("rest/api/2/issue/{id}/comment"), // post
	AddAttachment("rest/api/2/issue/{id}/attachments"); // post

	private String resource;

	APIResources(String resource) {
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}

}
