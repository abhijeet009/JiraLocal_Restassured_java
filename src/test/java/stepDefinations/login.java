package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Login;
import pojo.SeassionPojo;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

@RunWith(Cucumber.class)
public class login extends Utils {
	RequestSpecification res;
	ResponseSpecification resexpect;
	APIResources apipath = APIResources.valueOf("Loginuser");
	TestDataBuild TD = new TestDataBuild();
	Login loginObj;
	Response response;
	SessionFilter seassion = new SessionFilter();
	SeassionPojo SP = new SeassionPojo();
	
	@Given("^User can login with admin credentials using post method$")
	public void user_can_login_with_admin_credentials_using_post_method() throws Throwable {
		
		System.out.println("get value"+SP.getValue());
		String check= SP.getValue();
		
		if(check.equals("temp")) 
		{
		loginObj = TD.LoginPojo();
		response = given().spec(requestSpecification()).body(loginObj).filter(seassion).when().post(apipath.getResource()).then().log().all().
			    extract().response();
		assertEquals(response.getStatusCode(), 200);
		SP.setName(getJsonPath(response, "session.name"));
		SP.setValue(getJsonPath(response, "session.value"));
		SP.setXsrf(response.cookie("atlassian.xsrf.token"));
		addGlobalValues("name", getJsonPath(response, "session.name"));
		addGlobalValues("value", getJsonPath(response, "session.value"));
		addGlobalValues("xsrf", response.cookie("atlassian.xsrf.token"));
		System.out.println(SP.getName());
		System.out.println(SP.getValue());
		System.out.println(SP.getXsrf());
		}
		else {
			System.out.println("already exist below are name value and xsrf");
			System.out.println(SP.getName());
			System.out.println(SP.getValue());
			System.out.println(SP.getXsrf());
		}
		
	}
}