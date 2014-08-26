package Sample.com.qait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

	public static void main(String[] args) {
		
		 WebDriver driver = new FirefoxDriver();

	        driver.get("http://www.google.com");
	        
	        WebElement element = driver.findElement(By.name("q"));

	        element.sendKeys("Cheese!");

	        element.submit();

	        System.out.println("Page title is: " + driver.getTitle());
	        
	        driver.quit();
	    }
	}

