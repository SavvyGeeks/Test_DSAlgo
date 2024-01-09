package LoggerTest;

import org.testng.annotations.Test;

// Run All
public class LoggerTest {
	
	@Test
	//Run | Debug
public void tst01_Testinglog() throws InterruptedException
{
	// if want to display. info message
	LoggerLoad. info("‹------- Testing Info---------------->");
	//if want to display warn message
	LoggerLoad.warn("<------Testing warn---------------->");
	// if want to display error message
	LoggerLoad.error("‹------- Testing error--------->");
	}
	
	public static void main(String[] a) {
		System.out.println("HEllo");
		try {
			new LoggerTest().tst01_Testinglog();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}