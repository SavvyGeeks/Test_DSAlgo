package StepDefinition;

import java.io.IOException;

import com.pages.GraphPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSD {

	GraphPage graphPage = new GraphPage(DriverFactory.getDriver());

	@When("I click the GetStared button under Graph subtitle")
	public void i_click_the_get_stared_button_under_graph_subtitle() {
		// Write code here that turns the phrase above into concrete actions
		graphPage.clickGraphGetstarted();
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Home page")
	public void navigates_to_graph_home_page() {
		graphPage.ClickGraphLink();
	}

	@When("I click the Graph Link")
	public void i_click_the_graph_link() {
		// Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphLink();
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Page")
	public void navigates_to_graph_page() {
	}

	@When("I click the Graph Representations Link")
	public void i_click_the_graph_representations_link() {
		// Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphRepLink();
		// throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Representations Try Page")
	public void navigates_to_graph_representations_try_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("displays {string} in the output")
	public void displays_in_the_output(String string) {
		// Write code here that turns the phrase above into concrete actions
		//  throw new io.cucumber.java.PendingException();
	}





}