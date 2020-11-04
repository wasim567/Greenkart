package stepdefenation;

import org.openqa.selenium.WebDriver;

import POM.Landingpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import resources.Base;

public class Stepdef1 extends Base {
	
public WebDriver driver;
public Landingpage lp;

    @Given("^user navigated to the Greenkart site \"([^\"]*)\"$")
    public void user_navigated_to_the_greenkart_site_something(String url) throws Throwable {
        this.driver=Base.intializeBrowser();
        driver.get(url);
        lp=new Landingpage(driver);
        
    }

    @When("^user entered the text \"([^\"]*)\" in search box$")
    public void user_entered_the_text_something_in_search_box(String vegetablename) throws Throwable {
    	//lp=new Landingpage(driver);  
    	System.out.println(vegetablename);
        lp.searchbox().sendKeys(vegetablename);
        Thread.sleep(4000);
       
    	
    	
    }

    @When("^user clicks on Add to cart$")
    public void user_clicks_on_add_to_cart() throws Throwable {
        lp.addToCart().click();
    }

    @Then("^user is able to validate the Logo$")
    public void user_is_able_to_validate_the_logo() throws Throwable {
       
       String logotext="GREENKART";
       Assert.assertEquals(logotext, lp.logo().getText());
        
    }

    @Then("^user is able to see the search result$")
    public void user_is_able_to_see_the_search_result() throws Throwable {
    	Assert.assertEquals("Brinjal - 1 Kg", lp.searchedresult().getText());;
    	
    }

    @Then("^the user is able to see the added item in the cart$")
    public void the_user_is_able_to_see_the_added_item_in_the_cart() throws Throwable {
    
    	Assert.assertTrue(lp.cartItem().isDisplayed());
    }

    @And("^clicks on cart icon$")
    public void clicks_on_cart_icon() throws Throwable {
       lp.cartIcon().click();
       Thread.sleep(4000);
    

}

}
