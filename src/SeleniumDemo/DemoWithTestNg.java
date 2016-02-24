package SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class DemoWithTestNg {

public static WebDriver driver =null ;

	@BeforeMethod
	public void beforeMethod() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		}

	@Test
	public void Demo() throws InterruptedException {
		//Launch the Online Store Website
		driver.get("http://www.seleniumbuzz.com");

		// Print a Log In message to the screen
		System.out.println("Successfully opened the website www.seleniumbuzz.com");

		//Wait for 5 Sec
		Thread.sleep(5);

	}

	@AfterMethod
	public void afterMethod() {

		// Close the driver
		driver.quit();

	}

}
