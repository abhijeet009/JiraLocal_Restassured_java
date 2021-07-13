package resources;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pojo.Addcomment;
import pojo.Createissue;
import pojo.Createproject;
import pojo.Createuser;
import pojo.Login;
import pojo.assignee;
import pojo.fields;
import pojo.issuetype;
import pojo.priority;
import pojo.project;
import pojo.reporter;
import pojo.visibility;

public class TestDataBuild extends Utils{
	
	
	public Login LoginPojo() throws IOException {
		Login L = new Login();
		L.setUsername(getGlobalValue("username"));
		L.setPassword(getGlobalValue("password"));
		System.out.println("Test Data build "+getGlobalValue("username"));
		return L;
	}
	
	public Createuser createUserpojo() throws IOException {
		Createuser cs = new Createuser();
		cs.setName(getGlobalValue("newuser1"));
		cs.setPassword(getGlobalValue("password"));
		cs.setEmailAddress(getGlobalValue("newuser1email"));
		cs.setDisplayName(getGlobalValue("newuser1"));
		return cs;
	}
	
	public Createproject creteProjectpojo() throws IOException {
		Createproject CP = new Createproject();
		CP.setKey(getGlobalValue("key"));
		CP.setName(getGlobalValue("projectname"));
		CP.setProjectTypeKey(getGlobalValue("projectTypeKey"));
		CP.setProjectTemplateKey(getGlobalValue("projectTemplateKey"));
		CP.setDescription(getGlobalValue("Pdescription"));
		CP.setLead(getGlobalValue("newuser1"));
		CP.setUrl(getGlobalValue("baseUrl"));
		CP.setAssigneeType(getGlobalValue("assigneeType"));
		CP.setAvatarId(Integer.parseInt(getGlobalValue("avatarId")));
		CP.setCategoryId(Integer.parseInt(getGlobalValue("categoryId")));
		return CP;
	}
	public Createissue createissuePojo() throws IOException {
		Createissue CI = new Createissue();
		project PP = new project();
		issuetype IP = new issuetype();
		assignee AP = new assignee();
		reporter RP = new reporter();
		priority PPojo = new priority();
		fields FP = new fields();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date =  new Date();
		PP.setId(getGlobalValue("projectid"));
		FP.setSummary(getGlobalValue("summary")+formatter.format(date));
		IP.setId(getGlobalValue("issuetypeid"));
		AP.setName(getGlobalValue("assigneename"));
		RP.setName(getGlobalValue("reportername"));
		PPojo.setId(getGlobalValue("priorityid"));
		List<String> setList = new ArrayList<String>();
		setList.add(getGlobalValue("labels"));
		FP.setLabels(setList);
		FP.setDescription(getGlobalValue("description"));
		FP.setProject(PP);
		FP.setIssuetype(IP);
		FP.setAssignee(AP);
		FP.setReporter(RP);
		FP.setPriority(PPojo);
		CI.setFields(FP);
		return CI;
	}
	
	public Addcomment addCommentPojo() throws IOException {
		Addcomment AC = new Addcomment();
		visibility VB = new visibility();
		AC.setBody(getGlobalValue("body"));
		VB.setType(getGlobalValue("visibilitytype"));
		VB.setValue(getGlobalValue("visibilityvalue"));
		AC.setVisibility(VB);
		return AC;
		
	}
}
