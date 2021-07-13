package stepDefinations;

import static io.restassured.RestAssured.given;


import io.cucumber.java.en.Then;
import pojo.Createuser;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class user extends Utils {
	Createuser cuser ;
	TestDataBuild TD = new TestDataBuild();
	APIResources apipath = APIResources.valueOf("Createuser");
	 @Then("^Create New user using post method$")
	    public void create_new_user_using_post_method() throws Throwable {
		 cuser = TD.createUserpojo();
		 given().log().all().auth()
		 .preemptive().basic(getGlobalValue("username"), getGlobalValue("password"))
		 .header(getGlobalValue("name"),getGlobalValue("value"))
		 .header("Content-Type", "application/json")
		 .header("Connection","keep-alive")
		 .body(cuser).when().post(apipath.getResource())
		 .then()
		 .assertThat()
		 .statusCode(201);

	 }
}
