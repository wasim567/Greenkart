package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;

	private By Logo=By.cssSelector("div[class='brand greenLogo']");
	private By Searchbox=By.xpath("//input[@type='search']");
	private By Searchedresult=By.xpath("//h4[@class='product-name']");
    private By Addtocart=By.xpath("//button[text()='ADD TO CART']");
    private By Carticon=By.cssSelector("img[alt='Cart']");
    private By Caritem=By.xpath("//ul[@class='cart-items'] //p[text()='Brinjal - 1 Kg'][1]");
public Landingpage(WebDriver driver) {
		
	this.driver=driver;
	}




public WebElement logo(){
	return driver.findElement(Logo);
	
}

public WebElement searchbox(){
	return driver.findElement(Searchbox);
	
}


public WebElement searchedresult(){
	return driver.findElement(Searchedresult);
	
}
public WebElement addToCart(){
	return driver.findElement(Addtocart);
	
}

public WebElement cartIcon(){
	return driver.findElement(Carticon);
	
}


public WebElement cartItem(){
	return driver.findElement(Caritem);
	
}


}
