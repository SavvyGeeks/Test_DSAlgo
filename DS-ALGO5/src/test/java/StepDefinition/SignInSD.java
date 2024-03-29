package StepDefinition;

import java.io.IOException;

import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSD {

	SignInPage signIn = new SignInPage(DriverFactory.getDriver());

//	@Given("User is on home page")
//	public void user_is_on_home_page() {
//		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
//	}
//
//	@When("User clicked on SignIn button")
//	public void user_clicked_on_sign_in_button() {
//		signIn.clickSignIn();
//	}
//	@And("User enters sheetname {string} and rownumber {int}")
//	public void user_enters_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException {
//		signIn.readDataFromSheet(sheetName, rowNumber);
//	}
//
//	@Then("Enter username {string} and password {string} to sign in")
//	public void enter_username_and_password_to_sign_in(String userName, String password) throws IOException {
//		signIn.sendUsername();
//		signIn.sendPassword();
//	}
//
//	@Then("It navigates to login page")
//	public void it_navigates_to_login_page() {
//		System.out.println("Welcome to Login page");
//	}
//	@Then("User clicked on login button")
//	public void user_clicked_on_login_button() {
//		signIn.clickLoginBtn();
//	}
//	@Then("User navigates to home page")
//	public void user_navigates_to_home_page() {
//		System.out.println("Welcome to homepage");
//	}

	@Given("User is on home page and click SignIn button")
	public void user_is_on_home_page_and_click_sign_in_button() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		signIn.clickSignIn();
	}

	@When("User enters sheetname {string} and rownumber {int}")
	public void user_enters_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException {
		
		signIn.readDataFromSheet(sheetName, rowNumber);
	}

	@When("Enter username {string} and password {string} and click on login button")
	public void enter_username_and_password_and_click_on_login_button(String string, String string2) throws IOException {
		signIn.sendUsername();
		signIn.sendPassword();
		signIn.clickLoginBtn();

	}

	@Then("User navigates to home page and see success message")
	public void user_navigates_to_home_page() {

		signIn.verifyValidUserLoginMessage();
	}


	@Then("User will see invalid user details message")
	public void user_will_see_invalid_user_details_message() {
		signIn.verifyInvalidUserErrorMessage();
	}



	@When("when user completes all operations")
	public void when_user_completes_all_operations() {
	  
	    
	}

	@Then("User click on Signout")
	public void user_click_on_signout() {
	   
		signIn.clickSignOut();
	   
	}



}