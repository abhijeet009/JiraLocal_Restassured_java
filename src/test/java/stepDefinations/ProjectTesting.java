package stepDefinations;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.specification.RequestSpecification;
import pojo.Createproject;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class ProjectTesting extends Utils {
	TestDataBuild TD = new TestDataBuild();
	Createproject cp;
	APIResources apipath = APIResources.valueOf("Createproject");
	APIResources getAllproject = APIResources.valueOf("Getallprojects");
	
	 @Then("^get all project and show list$")
	    public void get_all_project_and_show_list() throws Throwable {
		 cp = TD.creteProjectpojo();
		  given().log().all().auth()
		 .preemptive().basic(getGlobalValue("username"), getGlobalValue("password"))
		 .header("Cookie",getGlobalValue("name"),getGlobalValue("value"))
		 .header("atlassian.xsrf.token",getGlobalValue("xsrf"))
		 .header("Content-Type", "application/json")
		 .header("Connection","keep-alive")
		 
		 .body(cp).when().post(apipath.getResource())
		 .then()
		 .assertThat()
		 .statusCode(201);
	    }

	    @And("^create new project using post method$")
	    public void create_new_project_using_post_method() throws Throwable {
	    	given().log().all().auth()
			 .preemptive().basic(getGlobalValue("username"), getGlobalValue("password")).when().get(getAllproject.getResource());
	    	
	    }
}
