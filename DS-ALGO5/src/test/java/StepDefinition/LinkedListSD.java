package StepDefinition;

import java.io.IOException;

import com.pages.LinkedListPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSD {

	LinkedListPage llPage = new LinkedListPage(DriverFactory.getDriver());



	@When("User click the GetStared button under Linked List subtitle")
	public void user_click_the_get_stared_button_under_linked_list_subtitle() {
		llPage.getStarted();
	}

	@Then("User Navigates to Linked List overview")
	public void user_navigates_to_linked_list_overview() {
	}

	public void slowDown() {
		try {
			//Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("User click on Introduction link")
	public void user_click_on_introduction_link() {
		llPage.clickOnIntroduction();
		slowDown();
	}

	@Then("Navigates to Introduction Page in Linked List")
	public void navigates_to_introduction_page_in_linked_list() {
	}
	@Given("User click on Creating Linked LIst")
	public void user_click_on_creating_linked_l_ist() {
		llPage.clickOnCreatingLinkedListLink();
		slowDown();
	}

	@Then("Naviagates to Creating Linked LIst page")
	public void naviagates_to_creating_linked_l_ist_page() {
	}

	@Given("User click on Types of Linked List")
	public void user_click_on_types_of_linked_list() {
		llPage.clickOnTypesofLinkedListLink();
		slowDown();
	}

	@Then("Naviagates to Types of Linked List page")
	public void naviagates_to_types_of_linked_list_page() {
	}

	@Given("User click on Implement Linked List in Python")
	public void user_click_on_implement_linked_list_in_python() {
		llPage.clickOnImplLinkedListInPythonLink();
		slowDown();
	}

	@Then("Naviagates to Implement Linked List in Python page")
	public void naviagates_to_implement_linked_list_in_python_page() {
	}

	@Given("User click on Traversal in Python")
	public void user_click_on_traversal_in_python() {
		llPage.clickOnTraversalLink();
		slowDown();
	}
	

	@Then("Naviagates to Traversal page")
	public void naviagates_to_traversal_page() {
	}

	@Given("User click on Insertion in Python")
	public void user_click_on_insertion_in_python() {
		llPage.clickOnInsertionLink();
		slowDown();
	}

	@Then("Naviagates to Insertion page")
	public void naviagates_to_insertion_page() {
	}

	@Given("User click on Deletion in Python")
	public void user_click_on_deletion_in_python() {
		llPage.clickOnDeletionLink();
		slowDown();
	}

	@Then("Naviagates to Deletion page")
	public void naviagates_to_deletion_page() {
	}
	@Given("User click on Practice Questions")
	public void user_click_on_practice_questions() {
		llPage.clickOnPracticeQLink();
	}

	@Then("Naviagates to Practice Questions page")
	public void naviagates_to_practice_questions_page() {
	}
}