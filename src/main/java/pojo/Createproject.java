package pojo;

public class Createproject {

	private String key;
	private String name;
	private String projectTypeKey;
	private String projectTemplateKey;
	private String description;
	private String lead;
	private String url;
	private String assigneeType;
	public int getAvatarId() {
		return avatarId;
	}
	public void setAvatarId(int avatarId) {
		this.avatarId = avatarId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	private int avatarId;
	private int categoryId;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProjectTypeKey() {
		return projectTypeKey;
	}
	public void setProjectTypeKey(String projectTypeKey) {
		this.projectTypeKey = projectTypeKey;
	}
	public String getProjectTemplateKey() {
		return projectTemplateKey;
	}
	public void setProjectTemplateKey(String projectTemplateKey) {
		this.projectTemplateKey = projectTemplateKey;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLead() {
		return lead;
	}
	public void setLead(String lead) {
		this.lead = lead;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAssigneeType() {
		return assigneeType;
	}
	public void setAssigneeType(String assigneeType) {
		this.assigneeType = assigneeType;
	}

	
}
