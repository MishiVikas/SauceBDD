package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tech.grasshopper.pdf.pojo.cucumber.Scenario.ScenarioBuilder;
import utils.PropertyReaders;

public class AppHooks 
{
	private WebDriver driver;
	private DriverFactory driverFactory ;
	
	private String browser;
	
	@Before(order=0)
	public void getProp()
	{	
		 browser = PropertyReaders.init_prop("browser");		
	}

	@Before(order=1)
	public void setUp()
    {    
		driverFactory = new DriverFactory();
	    driver = driverFactory.init_driver(browser);
    }
	
	@After(order=0)
	public void tearDown()
    {
		driver.quit();
    }
	

	
}
