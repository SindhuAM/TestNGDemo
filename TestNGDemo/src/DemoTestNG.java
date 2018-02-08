import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	public static String driverPath = "C:\\Users\\SA050728\\chromedriver_win32\\";
	public static WebDriver driver;
	 
	 	@BeforeTest
		public void open()
		{
			
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			//driver.navigate().to("http://www.google.com");
		}
	 	
	 	
	 	@Test
	 	public void site()
	 	{
	 		driver.navigate().to("http://www.google.com");
	 	}
	 	
}


