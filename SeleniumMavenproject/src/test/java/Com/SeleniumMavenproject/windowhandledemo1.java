package Com.SeleniumMavenproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
* @author Satya karuparthi
* Handling Multiple Windows - getWindowHandles() & switchTo()  using Selenium Webdriver?
*/
public class windowhandledemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        driver.findElement(By.id("ta1")).sendKeys("Satya Window handling Testing");
        Thread.sleep(3000);
        //One Window
        driver.findElement(By.linkText("Open a popup window")).click();
        //Two Windows
     Set<String> windowIDS = driver.getWindowHandles();
	 String textonpage = null;
    for (String wd : windowIDS) {
    	 driver.switchTo().window(wd);
    	 String pageTitle = driver.getTitle();
    	 if (pageTitle.equals("New Window")){
    		  textonpage = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
   		  driver.close();
    	 }
    }
	 System.out.println(textonpage);
	  driver.quit();
	}
}
