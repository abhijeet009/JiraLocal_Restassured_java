package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Addcomment;
import pojo.Createissue;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class IssueValidation extends Utils {
	APIResources createIssue = APIResources.valueOf("Createissue");
	APIResources getIssue = APIResources.valueOf("Getissue");
	APIResources editIssue = APIResources.valueOf("Editissue");
	APIResources addComment = APIResources.valueOf("Addcomment");
	APIResources addAtachment = APIResources.valueOf("AddAttachment");
	Response response;
	TestDataBuild TD = new TestDataBuild();
	String issuekey;
	Createissue CI;
	Addcomment AC;
	RequestSpecification res;
	@And("^Create new issue using post method$")
	public void create_new_issue_using_post_method() throws Throwable {
		res =given().log().all().auth()
				 .preemptive().basic(getGlobalValue("username"), getGlobalValue("password"))
				 .header(getGlobalValue("name"),getGlobalValue("value"))
				 .header("Content-Type", "application/json")
				 .header("Connection","keep-alive").
				 log().all();
		CI = TD.createissuePojo();
		System.out.println("Create issue step defination " + CI.getFields());
		response = res.body(CI).when().post(createIssue.getResource());
		issuekey=String.valueOf(getJsonPath(response,"id"));
		assertEquals(response.getStatusCode(), 201);
	}
	 @And("^Add comment on issue$")
	    public void add_comment_on_issue() throws Throwable {
	        AC=TD.addCommentPojo();
	        response=res.pathParam("id", issuekey).body(AC).post(addComment.getResource());
	        assertEquals(response.getStatusCode(), 201);
	    }


	@Then("^Add attachment using post method$")
	public void add_attachment_using_post_method() throws Throwable {
		res.header("X-Atlassian-Token", "no-check").pathParam("id", issuekey)
		.header("Content-Type", "multipart/form-data")
		.multiPart("file",
				new File("D:\\Abhijeet\\WebAutomations\\rest_assured\\src\\main\\java\\rest_assured\\test.txt"))
		.when().post(addAtachment.getResource()).then().log().all().assertThat().statusCode(200);
	}
}
