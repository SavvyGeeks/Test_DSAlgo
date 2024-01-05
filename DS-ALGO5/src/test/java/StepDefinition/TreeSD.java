package StepDefinition;

import java.io.IOException;

import com.pages.SignInPage;
import com.pages.TreePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSD {

    TreePage treePage = new TreePage(DriverFactory.getDriver());

  
    @Given("User on Home Page after signing in for TreePage")
    public void user_on_home_page_after_signing_in_for_tree_page() {
    }

    @When("User click the GetStared button under Tree subtitle")
    public void User_click_the_get_stared_button_under_tree_subtitle() {
        treePage.ClickTreeGetStared();
    }

    @Then("User Navigates to Tree Home page")
    public void user_navigates_to_tree_home_page() {
       
    }

    @When("User click the overview Link on Tree")
    public void user_click_the_overview_link_on_tree() {
        treePage.ClickOverviewLink();
    }
    @Then("The user navigates to the overview Link on Tree")
    public void the_user_navigates_to_the_overview_link_on_tree() {
        System.out.println("Welcome to Overview Page");

    }

    @When("User click the terminologies Link")
    public void user_click_the_terminologies_link() {
        treePage.ClickTerminologiesLink();
    }

    @Then("User Navigates to the terminologies Link")
    public void user_navigates_to_the_terminologies_link() {
    
    }

    @When("User click the types of Tree Link")
    public void user_click_the_types_of_tree_link() {
        treePage.ClickTypeLink();
    }

    @Then("User Navigates to the Types of Tree in Tree Page")
    public void user_navigates_to_the_types_of_tree_in_tree_page() {
    }

    @When("User click the Tree Traversals Link")
    public void user_click_the_tree_traversals_link() {
        treePage.ClickTreeLink();
    }
    @Then("User Navigates Tree Traversals page on Tree Page")
    public void user_navigates_tree_traversals_page_on_tree_page() {
    
    }
    @When("User click the Tree Traversals Illustration Link")
    public void user_click_the_tree_traversals_illustration_link() {
        treePage.ClickTraversalsLink();
    }

    @Then("User Navigates the Tree Traversals Illustration Page on Tree")
    public void user_navigates_the_tree_traversals_illustration_page_on_tree() {
    }

    @When("User click the binary Trees Link")
    public void user_click_the_binary_trees_link() {
        treePage.ClickBinaryLink();
    }

    @Then("User Navigates click the binary Trees Page On Tree")
    public void user_navigates_click_the_binary_trees_page_on_tree() {
    }

    @When("User click the types Of Binary Tree Link")
    public void user_click_the_types_of_binary_tree_link() {
        treePage.ClickTypesOfBinaryLink();
    }

    @Then("User Navigates the types Of Binary Tree Link")
    public void user_navigates_the_types_of_binary_tree_link() {
    }

    @When("User click the implementationInPython Link")
    public void user_click_the_implementation_in_python_link() {
        treePage.ClickImplementationInPythonLink();
    }
    @Then("User Navigates the implementationInPython Page")
    public void user_navigates_the_implementation_in_python_page() {
    }

    @When("I click the binaryTreeTraversals Link")
    public void i_click_the_binary_tree_traversals_link() {
        treePage.ClickBinaryTreeTraversalsLink();
    }
    @When("User click the implementationOfBinary Link")
    public void user_click_the_implementation_of_binary_link() {
        treePage.ClickImplementationOfBinaryLink();
    }

    @Then("User Navigates the implementationOfBinary Page")
    public void user_navigates_the_implementation_of_binary_page() {
    	
    }

    @When("User click the applications of Binary Tree Link")
    public void user_click_the_applications_of_binary_tree_link() {
        treePage.ClickApplicationsLink();
    }

    @Then("User Navigates the applications of Binary Tree Page")
    public void user_navigates_the_applications_of_binary_tree_page() {
    	
    }

    @When("User click the binarySearch Trees Link")
    public void user_click_the_binary_search_trees_link() {
        treePage.ClickBinarySearchLink();
    }

    @Then("User Navigates the binarySearch Trees on Tree Page")
    public void user_navigates_the_binary_search_trees_on_tree_page() {
    	
    }

    @When("User click the implementationOfBST Link")
    public void user_click_the_implementation_of_bst_link() {
        treePage.ClickImplementationOfBstLink();
    }

    @Then("User Navigates the implementationOfBST Page")
    public void user_navigates_the_implementation_of_bst_page() {
    	
    }

    @Given("User should navigate to Tree Home page")
    public void user_should_navigate_to_tree_home_page() {
        DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");
    }


}
