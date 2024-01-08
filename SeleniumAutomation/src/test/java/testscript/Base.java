package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public WebDriver driver;
	public void initializeBrowser()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Amalu\\eclipse-workspace\\SeleniumAutomation\\src\\main\\resources\\resources\\chromedriver.exe" );
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Amalu\\git\\seleniumrepo\\SeleniumAutomation\\src\\main\\resources\\resources\\chromedriver.exe" );
	driver =new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	}
	public void driverQuit()
	{
		driver.close();
		//driver.quit();
	}

	public static void main(String[] args)
	{
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuit();
		
	}
	
	
}

