package Com.SeleniumMavenproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
* @author Satya karuparthi
* How to handle multiple Windows or tabs using Selenium Webdriver?
*/	
public class testWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//Single Window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent Window Handle : "+parentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newWindowBtn")).click();
	       Thread.sleep(3000);
	       Set<String> windowHandles = driver.getWindowHandles();
	       for (String windowHandle : windowHandles) {
	    	   if (!windowHandle.equals(parentWindowHandle)) {
	    		   driver.switchTo().window(windowHandle);
	    		   driver.manage().window().maximize();
	    		   driver.findElement(By.id("firstName")).sendKeys("satya srinivas");
	    		   Thread.sleep(3000);
	    		   driver.close();
	    		   Thread.sleep(3000);
	    	   }
//	    	   System.out.println(windowHandle + driver.getTitle());
	       }
	       driver.switchTo().window(parentWindowHandle);
		   driver.findElement(By.id("name")).sendKeys("selenium tutorials");
		   Thread.sleep(3000);
	       driver.quit(); 
	}

}
