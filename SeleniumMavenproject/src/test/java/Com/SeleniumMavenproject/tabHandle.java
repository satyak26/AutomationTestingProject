package Com.SeleniumMavenproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
* @author Satya karuparthi
* How to handle multiple tabs using Selenium Webdriver?
*/
public class tabHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//Single Tab
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println("Parent Window Handle : "+parentWindowHandle + driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
	       Thread.sleep(3000);
	       Set<String> windowHandles = driver.getWindowHandles();
	       for (String windowHandle : windowHandles) {
	    	   if (!windowHandle.equals(parentWindowHandle)) {
	    		   driver.switchTo().window(windowHandle);
	    		   driver.manage().window().maximize();
	    		   //Alert Box
	    			System.out.println("Statring print text: "+ driver.findElement(By.id("output")).getText());
	    			driver.findElement(By.id("alertBox")).click();
	    			System.out.println(driver.switchTo().alert().getText());
	    			Thread.sleep(3000);
	    			driver.switchTo().alert().accept();
	    			System.out.println(driver.findElement(By.id("output")).getText());
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
