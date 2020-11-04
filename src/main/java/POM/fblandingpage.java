package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fblandingpage {
	
	public WebDriver driver=null;
public fblandingpage(WebDriver driver) {
		this.driver=driver;
	}



private By Fblogo=By.cssSelector("img[alt='Facebook']");
private By Username=By.id("email");
private By Password=By.id("pass");
private By Login=By.id("u_0_b");

public WebElement fbLogo(){
	return driver.findElement(Fblogo);
}

public WebElement userName(){
	return driver.findElement(Username);
}


public WebElement passWord(){
	return driver.findElement(Password);
}

public WebElement logIn(){
	return driver.findElement(Login);
}

}
