
package StepDefinition;
import static org.testng.Assert.assertEquals;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader1;
import com.qa.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSHomePageSD {

	HomePage home= new HomePage(DriverFactory.getDriver());
	String registerurl=ConfigReader1.getregisterUrl();
	String loginurl=ConfigReader1.getloginUrl();
	
	// User launch DsAlgo page
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws Exception {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");
		System.out.println("Driver launch");		
		LoggerLoad.info("User opens DS Algo portal link");
	}
	
	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) throws InterruptedException {

		home.getStarted();
		//Thread.sleep(1000);
		LoggerLoad.info("User clicks on Get Started button");
	}
	
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homePage() throws InterruptedException {

		String title = home.getPageTitle();
		//Thread.sleep(1000);
		System.out.println("the tittle");
		assertEquals(title,"NumpyNinja","Do not match");
		LoggerLoad.info("User is redirected to homepage");

	}
	 //User tries to access the modules without logging in
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		home.homePg();
		System.out.println("the tittle");
		LoggerLoad.info("User is in home page");
	    
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
	    home.getStartedForModule(string);
	    LoggerLoad.info("User clicks on Get Started link on homepage without login");
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) throws InterruptedException {
	   String msg= home.alertmsg();
	   //Thread.sleep(3000);
	   assertEquals(msg, string, "Title do not match");
	   LoggerLoad.info("User get warning message as You are not logged in");
	}


	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
		home.dropdown(string);
		LoggerLoad.info("User clicks on dropdown");
	}
	
	@When("The user clicks on register link")
	public void the_user_clicks_on_register_link() {
	    home.click_register();
	    LoggerLoad.info("User clicks on register link");
	}

	@Then("The user redirected to Registration page")
	public void the_user_redirected_to_registration_page() {
	    String registerlink=home.reg_url();
	    assertEquals(registerlink,registerurl,"Link do not match");
	    LoggerLoad.info("User is in Registration page");
	}
	
	@When("The user clicks on signin link")
	public void the_user_clicks_on_signin_link() {
	    home.click_login();
	    LoggerLoad.info("User clicks on signin link");
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
		String loginlink=home.login_url();
	    assertEquals(loginlink,loginurl,"Link do not match");
	    LoggerLoad.info("User is in login page");
	}

	@Given("when all the scenarios in this feature file are done close the browser")
	public void when_all_the_scenarios_in_this_feature_file_are_done_close_the_browser() throws Exception{
		Thread.sleep(2000);
	    DriverFactory.closeallDriver();
	}
	
}
