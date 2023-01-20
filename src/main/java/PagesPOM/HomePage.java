package PagesPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
private WebDriver driver ;
	
	private By addtoCartBag = By.xpath("(//button[text() ='Add to cart'])[1]");
	private By addtoCartAll = By.xpath("//button[text() ='Add to cart']");
	private By cartBtn = By.xpath("//span[@class = 'shopping_cart_badge']");
	private By menubtn = By.xpath("//button[text() ='Open Menu']");
	private By bikeLight = By.xpath("(//button[text() ='Add to cart'])[2]");
	private By checkoutBtn = By.xpath("//button[@name= 'checkout']");
	private By continueBtn = By.xpath("//input[@name= 'continue']");
	private By firstName = By.xpath("//input[@id= 'first-name']");
	private By lastName = By.xpath("//input[@id= 'last-name']");
	private By zipCode = By.xpath("//input[@id= 'postal-code']");
	private By finishBtn = By.xpath("//button[@id= 'finish']");
	private By validationLightOrder = By.xpath("//h2[text() ='THANK YOU FOR YOUR ORDER']");
	
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String bagAddToCart()
	{
		driver.findElement(addtoCartBag).click();
		return driver.findElement(cartBtn).getText();
	}
	
	public String allProductAddToCart()
	{
		
		List<WebElement> AddCart = driver.findElements(addtoCartAll);
		for(WebElement e: AddCart)
		{
			e.click();
		}
		return driver.findElement(cartBtn).getText();
	}
	
	public void doAddBikeLight()
	{
		driver.findElement(bikeLight).click();		
	}
	
	public void proceedToCheckout()
	{
		driver.findElement(cartBtn).click();
		driver.findElement(checkoutBtn).click();		
	}
	
	public void addDetsails(String fn, String Ln, String zip)
	{
		driver.findElement(firstName).sendKeys(fn);
		driver.findElement(lastName).sendKeys(fn);
		driver.findElement(zipCode).sendKeys(zip);
		driver.findElement(continueBtn).click();
		driver.findElement(finishBtn).click();
	}
	
	public boolean validationBikeLight()
	{
		return driver.findElement(validationLightOrder).isDisplayed();
	}
	

}
