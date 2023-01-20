package driverFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{

	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal();
	
 @BeforeMethod
	public static WebDriver init_driver(String browser) 
	{
		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} 
		else if (browser.equals("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}	
			
		else 
		{
			System.out.println("Please pass the correct browser value: " + browser);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return getDriver();

	}
 
  public static synchronized WebDriver getDriver()
  {
	return tlDriver.get(); 
  }


}
