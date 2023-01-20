package PagesPOM;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver ;
	
	By username = By.xpath("//input[@id = 'user-name']");
	By pass = By.xpath("//input[@name = 'password']");
	By logBtn = By.xpath("//input[@id = 'login-button']");
	By menubtn = By.xpath("//button[text() ='Open Menu']");
	
//	By contact = By.xpath("//a[contains(text(), 'Contacts')]");
//	By newContact = By.xpath("//a[contains(text(), 'New Contact')]");
	
	public LoginPage(WebDriver driver)
     {
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	 }
  
  public void sendUsername (String user)
  {
	 WebElement un = driver.findElement(username);	     
		 un.clear();
		 un.sendKeys(user);
  }
 
  public void sendPass (String ps)
  {
	  WebElement pd = driver.findElement(pass);
      pd.clear();	 
	  pd.sendKeys(ps);
  }
  
  public void clickLogBtn ()
  {
	  driver.findElement(logBtn).click();
  }
	
  public boolean loginValidation()
  {
	  return driver.findElement(menubtn).isDisplayed();
  }
  
}
