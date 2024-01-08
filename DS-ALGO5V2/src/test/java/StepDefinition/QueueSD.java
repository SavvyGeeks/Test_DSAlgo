package StepDefinition;

//import org.openqa.selenium.WebDriver;
//import org.testng.asserts.SoftAssert;


import com.pages.QueuePage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSD {

	QueuePage QPage = new QueuePage(DriverFactory.getDriver());
	SignInPage signIn = new SignInPage(DriverFactory.getDriver());

	@When("User click the GetStared button under Queue subtitle")
	public void user_click_the_get_stared_button_under_queue_subtitle() {
		
	    QPage.clickGetStarted();
	}
	
	@Then("User Navigate to Queue Page")
	public void user_navigate_to_queue_page() {
	  
	}
	@When("User clicks Implimentation of Queue in Python")
	public void user_clicks_implimentation_of_queue_in_python() {
		QPage.clickImplementationofQueueinPython();
	  
	}

	@Then("User Navigate to the Implimentation of Queue in Python")
	public void user_navigate_to_the_implimentation_of_queue_in_python() {
	   
	}
	@When("User clicks Implimentation Using Collections.dqeque")
	public void user_clicks_implimentation_using_collections_dqeque() {
		
		
		QPage.clickImplementationusingcollectionsdeque();
	    
	}

	@Then("User Navigate to the Implimentation Using Collections.dqeque")
	public void user_navigate_to_the_implimentation_using_collections_dqeque() {
	  
	}

@When("User clicks Implimentation Using Array")
public void user_clicks_implimentation_using_array() {
  QPage.clickImplementationusingarray();  
}

@Then("User Navigate to the Implimentation Array")
public void user_navigate_to_the_implimentation_array() {
   
}

@When("User clicks Queue Operations")
public void user_clicks_queue_operations() {
	
	QPage.clickQueueOperations();
   
}

@Then("User Navigate to the Queue Operations")
public void user_navigate_to_the_queue_operations() {
   
}

@When("User clicks Queue Practice Questions")
public void user_clicks_queue_practice_questions() {
	
	QPage.clickpracticeQuestions1();
}

@Then("User Navigate to the Queue Practice Questions")
public void user_navigate_to_the_queue_practice_questions() { 


}

@Then("It Displays Null")
public void it_displays_null() {

}

@Then("User Back to Queue Page")
public void user_back_to_queue_page() {
  
}





}