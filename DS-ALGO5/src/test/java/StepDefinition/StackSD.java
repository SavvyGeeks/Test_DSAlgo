package StepDefinition;


import java.io.IOException;

import com.pages.SignInPage;
import com.pages.StackPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSD {


	private StackPage stackpage=new StackPage(DriverFactory.getDriver());

	SignInPage signIn = new SignInPage(DriverFactory.getDriver());

	

	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
		System.out.println("I am on home page");

	}

	@When("The user clicks on get started button")
	public void the_user_clicks_on_get_started_button() {
		stackpage.selectStack();

	}

	@Then("The user will be directed to Stack Page")
	public void the_user_will_be_directed_to_stack_page() {
		System.out.println("The user is on Stack page");

	}

	@Given("The user clicks on Operations in Stack link")
	public void the_user_clicks_on_operations_in_stack_link() {
		stackpage.clickOperationsLink();

	}


	@Given("The user is on Stack page")
	public void the_user_is_on_stack_page() {
		System.out.println("The user is on Stack page");

	}

	@When("The user clicks the Implementation link")
	public void the_user_clicks_the_implementation_link() {
		stackpage.clickImplementationLink();

	}
	
	@Then("user nagivates to Implementation page")
	public void user_nagivates_to_implementation_page() {
	   
	}



	@When("The user clicks the Applications link")
	public void the_user_clicks_the_applications_link() {
		stackpage.clickApplicationsLink();

	}
	
	@Then("user navigates to Application link page")
	public void user_nagivates_to_application_link_page() {
	   
	}


	@Then("The user will be redirected to tryEditor page with a Run button to test")
	public void the_user_will_be_redirected_to_try_editor_page_with_a_run_button_to_test() {
		System.out.println("I am on TryEditor page");

	}

	@When("The user clicks on to the Practice Questions link")
	public void the_user_clicks_on_to_the_practice_questions_link() {
		stackpage.clickPracticeQuesLink();

	}

	@Then("The user will be directed to practice questions of stack Page")
	public void the_user_will_be_directed_to_practice_questions_of_stack_page() {
		System.out.println("I am on Practice questions of Stack page");

	}


}