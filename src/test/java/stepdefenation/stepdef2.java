package stepdefenation;

import org.openqa.selenium.WebDriver;

import POM.fblandingpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import junit.framework.Assert;
import resources.Base;

public class stepdef2 extends Base {
	public WebDriver driver;
	fblandingpage flp;

    @Given("^user navigated to the facebook login page \"([^\"]*)\"$")
    public void user_navigated_to_the_facebook_login_page_something(String url) throws Throwable {
        driver=Base.intializeBrowser();
        driver.get(url);
        flp=new fblandingpage(driver);
    }

    @When("^user entered the username(.+) and password(.+)$")
    public void user_entered_the_username_and_password(String username, String password) throws Throwable {
       flp.userName().sendKeys(username);
       flp.passWord().sendKeys(password);
      
    }

    @Then("^user is able to see the facebook logo$")
    public void user_is_able_to_see_the_facebook_logo() throws Throwable {
    	
      Assert.assertTrue(flp.fbLogo().isDisplayed());
    }

    @Then("^user is able to login to fb account$")
    public void user_is_able_to_login_to_fb_account() throws Throwable {
       System.out.println("Successfully logged in");
    }

    @And("^clicked on Login$")
    public void clicked_on_login() throws Throwable {
    	 flp.logIn().click();	
    }


}
