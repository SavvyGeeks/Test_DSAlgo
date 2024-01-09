package StepDefinition;

import java.io.IOException;

import com.pages.ArrayPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraysSD {

	ArrayPage arraypage = new ArrayPage(DriverFactory.getDriver());
	
   @When("User click the GetStared button under Array subtitle")
	public void user_click_the_get_stared_button_under_array_subtitle() {
		arraypage.getStarted();
	}

	@Then("User Navigates to Array overview")
	public void user_navigates_to_array_overview() {
		
	}

	@When("User click on Array in Python")
	public void user_click_on_array_in_python() {
		arraypage.ClickonArrayinPython();
	}

	@Then("Navigates to Array in Python")
	public void navigates_to_array_in_python() {
		System.out.println("Now at Array in Python Page");
	}

	@Given("User click on Arrays Using List")
	public void userClickOnArraysUsingList() throws InterruptedException {
		arraypage.ClickonArrayusingList();

	}

	@Then("Naviagates to Arrays Using List")
	public void naviagatesToArraysUsingList() throws InterruptedException {
		arraypage.ClickonArrayusingList();
		System.out.println("Now at Arrays Using List Page");
	}
	@Given("User click on Basic Operations in Lists")
	public void userClickOnBasicOperationsInLists() {
		arraypage.ClickonBasicOperation();
	}

	@Then("Naviagates to Basic Operations in Lists")
	public void naviagatesToBasicOperationsInLists() {
		System.out.println("Now at Basic Operations in Lists Page");

	}

	@Given("User click on Applications of Array")
	public void userClickOnApplicationsOfArray() {
		arraypage.ClickonApplication();
	}

	@Then("Naviagates to Applications of Array")
	public void naviagatesToApplicationsOfArray() {
		System.out.println("Now at Applications of Array Page");
	}
	
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
	   arraypage.clickPracticeQuestions();
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
	  arraypage.clicksearchTheArray();
	}

	@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
	
	
	}
	
	@When("The user clicks the Max Consicutive ones")
	public void the_user_clicks_the_max_consicutive_ones() {
	 arraypage.clickmaxConsecutiveOnes();
	}
	
	@When("The user clicks the Find numbers with Even Number Of Digits")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits() {
	   
		arraypage.ClickFindNumberWithEvnNumOfDigits();
	}

	@When("The user clicks the Squres Of A Sorted Array")
	public void the_user_clicks_the_squres_of_a_sorted_array() {
		arraypage.ClickSquaresOfSortedArray();
	   
	}


//
//	@Given("The user is on Question page of {string} after logged in")
//	public void the_user_is_on_question_page_of_after_logged_in(String string) {
//	   
//	}
//
//	@When("The user enter valid python code in tryEditor from sheet {string} and {int} for the question")
//	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String string, Integer int1) {
//	   
//	}
//
//	@When("The user clicks on run button")
//	public void the_user_clicks_on_run_button() {
//	  
//	}
//
//	@Then("The user should be presented with Run result")
//	public void the_user_should_be_presented_with_run_result() {
//	   
//	}
//
//	@When("The user clicks on Submit button")
//	public void the_user_clicks_on_submit_button() {
//	  
//	}
//
//	@Then("The user should be presented with successful submission message")
//	public void the_user_should_be_presented_with_successful_submission_message() {
//	   
//	}

}