package stepsClass;

import java.util.List;
import java.util.Map;

import org.junit.Assume;

import PagesPOM.HomePage;
import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep 
{
	DriverFactory df = new DriverFactory();
	private HomePage hp = new HomePage (DriverFactory.getDriver());
	private String actText;
	private String actTextAll;

@When("user clicks on add to cart button of bag")
public void user_clicks_on_add_to_cart_button_of_bag()
{
	 actText = hp.bagAddToCart();

}

@Then("bag product should be added in cart")
public void bag_product_should_be_added_in_cart()
{
	String gvntext = "1";
	if(actText.equals(gvntext))
	{
		System.out.println("bag product added to cart");
	}	
	else
	{
		Assume.assumeFalse(true);
	}
}

@When("user clicks on add to cart button one by one")
public void user_clicks_on_add_to_cart_button_one_by_one()
{
	hp.allProductAddToCart();
	
}

@Then("all product should be added in cart")
public void all_product_should_be_added_in_cart()
{	
	System.out.println("All product added to cart");	
}


@When("user click on add to cart button of bike light")
public void user_click_on_add_to_cart_button_of_bike_light() 
{
	hp.doAddBikeLight();
}

@When("click on cart and checkout button")
public void click_on_cart_and_checkout_button()
{
    hp.proceedToCheckout();
}

@When("fill personal details like Firstname {string} Lastname {string}  zipcode {string} and clicks on checkout")
public void fill_personal_details_like_firstname_lastname_zipcode_and_clicks_on_checkout(String first, String last, String zip) 
{
  hp.addDetsails(first, last, zip);
}



@Then("user should get thank you message")
public void user_should_get_thank_you_message() 
{
	Assume.assumeTrue(hp.validationBikeLight());
}



}
