package stepsClass;

import org.apache.hc.core5.http2.hpack.HPackDecoder;
import org.junit.Assume;
import org.openqa.selenium.WebDriver;
import PagesPOM.LoginPage;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PropertyReaders;

/*
 * new changes
 * 
 */
public class LoginStep extends DriverFactory
{

    LoginPage login = new LoginPage(DriverFactory.getDriver());
    PropertyReaders prop = new PropertyReaders();
    DriverFactory df = new DriverFactory();
   
@Given("User is on Login Page")
public void user_is_on_login_page()
{	
	DriverFactory.getDriver().get("https://www.saucedemo.com/");
}

@When("user enters user name")
public void user_enters_user_name()
{
 login.sendUsername(PropertyReaders.init_prop("username"));
}

@When("user enter password")
public void user_enter_password()
{
login.sendPass(PropertyReaders.init_prop("password"));
}

@When("user clicks on login button")
public void user_clicks_on_login_button() 
{
	login.clickLogBtn(); 
}

@Then("user should be land on Home page")
public void user_should_be_land_on_home_page()
{
  Assume.assumeTrue(login.loginValidation());
}

@When("user is on home page")
public void user_is_on_home_page() 
{
	System.out.println(" ");
}
@When("user is at home page")
public void user_is_at_home_page() 
{
	
}



}
