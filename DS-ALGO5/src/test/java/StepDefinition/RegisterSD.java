package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.qa.factory.DriverFactory;
import com.qa.util.LoggerLoad;

import com.pages.RegisterPage;
import  com.pages.GetStartedPF;
import com.pages.HomePage;
// import  pagefactory.HomePF;
public class RegisterSD {



	public ChromeOptions options = new ChromeOptions();

	public void driver() {
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setImplicitWaitTimeout(Duration.ofSeconds(30));
	}

	WebDriver driver = DriverFactory.getDriver();//new ChromeDriver(options);

	HomePage Home= new HomePage(driver);

	RegisterPage register= new RegisterPage(driver);

	@Given("The user is in Ds-algo home  page")
	public void the_user_is_in_ds_algo_home_page() {


		//Home.getPageTitle();

		LoggerLoad.info("The user in DS Algo Homepage");

	}

	@Given("Clicks on the Register button")
	public void clicks_on_the_register_button() {
		register.clickRegisterLink();
		//register.assertregister();
		LoggerLoad.info("User clicks on Registration Link");

	}

	@Then("User is taken to the Registration page")
	public void user_is_taken_to_the_registration_page() {

	}

	@When("User clicks Register button with all fields empty")
	public void user_clicks_register_button_with_all_fields_empty() {
		register.Enterusername("");
		register.Enterpassword("");
		register.Enterconfirmpassword("");

		register.Register_Btn();

		LoggerLoad.info("User clicks on Registration Button with Empty feilds");

	}

	@Then("It should display an error-Please fill out this field, below Username textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_username_textbox() {


		register.ErrorMessage();

		LoggerLoad.info("Error Message dispalys below Username textbox");

	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {
		System.out.println("sumalatha");
		register.Enterusername("sumalatha");
		register.Enterpassword("");
		register.Enterconfirmpassword("");

		register.Register_Btn();
		LoggerLoad.info("The user clicks Register button after entering Username with other fields empty");
	}

	@Then("It should display an error -Please fill out this field, below Password textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_password_textbox() {

		register.ErrorMessage();

		LoggerLoad.info("Error Message dispalys ");
		register.erase();
	}

	@When("The user clicks Register button after entering Username and password with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty() {

		System.out.println("sumalatha and saavy");

		register.Enterusername("sumalatha");
		register.Enterpassword("Savvy1234");
		register.Enterconfirmpassword("");

		register.Register_Btn();
		LoggerLoad.info("The user clicks Register button after entering Username and password with Password Confirmation field empty");
	}

	@Then("It should display an error-Please fill out this field, below Password Confirmation textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_password_confirmation_textbox() {

		register.ErrorMessage();
		LoggerLoad.info("Error Message dispalys ");
		register.erase();
	}

	@When("The user enters a name with characters other than Letters, digits and special characters like @, ., +, -, _")
	public void the_user_enters_a_name_with_characters_other_than_letters_digits_and_special_characters_like() {

		register.Enterusername("$$%%^^");
		register.Enterpassword("Savvy1234");
		register.Enterconfirmpassword("Savvy1234");

		register.Register_Btn();
		LoggerLoad.info("Error Message dispalys below Password textbox");
	}

	@Then("It should display an error message- Please enter a valid username")
	public void it_should_display_an_error_message_please_enter_a_valid_username() {

		//RegisterPF.getInvalidUsername();
		LoggerLoad.info("Error Message dispalys below Password textbox");
		register.erase();

	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {

		register.Enterusername("Sumalatha");
		register.Enterpassword("Savvy1234");
		register.Enterconfirmpassword("Savvy");

		register.Register_Btn();
		LoggerLoad.info("The user clicks Register button after entering different passwords in Password and Password Confirmation fields");
	}

	@Then("It should display an error message-password_mismatch:The two password fields did not match.")
	public void it_should_display_an_error_message_password_mismatch_the_two_password_fields_did_not_match() {

		register.passwordMissmatch();

		register.erase();

	}

	@When("The user enters a Password with less than eight characters")
	public void the_user_enters_a_password_with_less_than_eight_characters() {

		register.Enterusername("Sumalatha");
		register.Enterpassword("Savvy");
		register.Enterconfirmpassword("Savvy");

		register.Register_Btn();


	}

	@Then("It should display an error message-Password should contain atleast eight characters")
	public void it_should_display_an_error_message_password_should_contain_atleast_eight_characters() {

		register.passwordLenght();

		register.erase();

	}

	@When("User enters valid username, password, password confirmation and clicks on Register button")
	public void user_enters_valid_username_password_password_confirmation_and_clicks_on_register_button() {

//		try {
//			//Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		register.Enterusername("Sumalatha1");
		register.Enterpassword("Savvy1234");
		register.Enterconfirmpassword("Savvy1234");

		System.out.println("sumalatha and saavyzzzzzzzzzzzzzzzzzzzzzzzz");
		register.Register_Btn();

	}

	@Then("The user should be redirected to Homepage with the message -New Account Created. You are logged in as <username>")
	public void the_user_should_be_redirected_to_homepage_with_the_message_new_account_created_you_are_logged_in_as_username() {


		register.HomeURL();
		register.newAccountMessage();
		LoggerLoad.info("It should display an new message with Account Username ");


	}
	//	@When("The user enters a valid existing <username> with <password> and <password confirmation>")
	//	public void the_user_enters_a_valid_existing_username_with_password_and_password_confirmation() {
	//		register.Enterusername("Sumalatha");
	//		register.Enterpassword("Savvy1234");
	//		register.Enterconfirmpassword("Savvy1234");
	//		
	//
	//		register.Register_Btn();
	//		LoggerLoad.info("It should display an error message as Username already exists");
	//try {
	//	Thread.sleep(1000);
	//} catch (InterruptedException e) {
	//	// TODO Auto-generated catch block
	//	e.printStackTrace();
	//}
	//		register.getExistedAcctMsg();
	//	}
	//
	//	@Then("The user displays error message {string}")
	//	public void the_user_displays_error_message(String string) {
	//
	//	}
	//
	//



}









