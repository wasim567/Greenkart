package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver intializeBrowser() throws IOException{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resources//data.properties");
		prop.load(fis);
		String browserName=System.getProperty("browser");
		if(browserName.contains("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//java//resources//chromedriver.exe");
			ChromeOptions cp=new ChromeOptions();
			if(browserName.contains("headless")){
				cp.addArguments("headless");
			}
			driver=new ChromeDriver(cp);
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
}
