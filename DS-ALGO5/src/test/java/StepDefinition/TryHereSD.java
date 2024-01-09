package StepDefinition;

import java.io.IOException;

import com.pages.TryHerePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TryHereSD {
	TryHerePage tryherepage = new TryHerePage(DriverFactory.getDriver());
	
	@Given("The User navigates to Try EditorPage")
	public void the_user_navigates_to_try_editor_page() {
		tryherepage.tryhere();
	   
	}
//
//	@When("The User Enter vaild statement in textbox")
//	public void the_user_enter_vaild_statement_in_textbox() throws InterruptedException {
//		tryhereypage.Txtarea();
//	}
	
	@When("User enters python code sheetname {string} and rownumber {int}")
	public void user_enters_python_code_sheetname_and_rownumber(String string, Integer int1) throws IOException {
		System.out.println("-----Try Here SD - "+string +"::row:"+int1);
		tryherepage.readInValidDataFromSheet(string, int1);
	}
	@Then("The User Enter Python valid data\"<pythonCode>\" in to the TextArea")
	public void the_user_enter_python_valid_data_python_code_in_to_the_text_area() throws InterruptedException {
		tryherepage.Txtarea();
	}

	@Then("User click on RunButton")
	public void user_click_on_run_button() {
		tryherepage.runButtton();
	   
	}

	@Then("It Display vaild message")
	public void it_display_vaild_message() throws InterruptedException {
		tryherepage.checkOutput();
	}

	@Then("The User Enters Invalid Python data\"<pythonCode>\" in to the TextArea")
	public void the_user_enters_invalid_python_data_python_code_in_to_the_text_area() throws InterruptedException {
	   tryherepage.Txtarea();

	}
	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() throws InterruptedException {
		//tryherepage.checkOutput();
		tryherepage.getErrorText();
		
	    
	}


}
