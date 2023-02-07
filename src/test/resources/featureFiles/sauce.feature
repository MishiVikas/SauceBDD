Feature: Sauce_d checking


  
   Background:
    Given User is on Login Page
    When user enters user name
    And user enter password
    And user clicks on login button
   
    @Smoke
    Scenario: Add bag product to cart
    Given user is on home page 
    When user clicks on add to cart button of bag
    Then bag product should be added in cart
    
    @Regression
    Scenario: Add all products to cart
    Given user is at home page 
    When user clicks on add to cart button one by one
    Then all product should be added in cart

 @Smoke @Regression
  Scenario: order bike light
  Giver user is on home age
  When user click on add to cart button of bike light
  And click on cart and checkout button
  And fill personal details like Firstname "Vikas" Lastname "Mishra"  zipcode "412542" and clicks on checkout
  Then user should get thank you message 
  
  