package StepDefinition;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pages.SignInPage;
import com.pages.SignOutPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOutSD{

    SignOutPage signOut = new SignOutPage(DriverFactory.getDriver());
    SignInPage signIn = new SignInPage(DriverFactory.getDriver());
     WebDriver driver;
     

     @Given("User enters sheetname {string} and rownumber <rowNumber>")
     public void user_enters_sheetname_and_rownumber_row_number(String string) {
    	 DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
    	 								//https://dsportalapp.herokuapp.com/home
	        signIn.clickSignIn();
        
     }

     @Then("Enter username {string} and password {string} to signin")
     public void enter_username_and_password_to_signin(String sheetName, Integer rowNumber) throws IOException {
    	 signIn.readDataFromSheet(sheetName, rowNumber);
    	 signIn.sendUsername();
	        signIn.sendPassword();
	        signIn.clickLoginBtn();
      
     }

     @When("The user in DS Algo home page")
     public void the_user_in_ds_algo_home_page() {
        
     }

     @Then("The User click signedout its navigate to home page")
     public void the_user_click_signedout_its_navigate_to_home_page() throws InterruptedException {
        
    	 signOut.SignoutClick();
     }
}