package Com.SeleniumMavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Satya karuparthi
 * Locating all the elements having the input tag on the web page and printing their type
 */
public class TagHrefHypelinkdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

       List<WebElement> linkTagElements = driver.findElements(By.tagName("a"));
       
       System.out.println("No of Links on  thi page are : "+linkTagElements.size());
       System.out.println("------------------------------------");
       
       for(WebElement e : linkTagElements)
       {
    	   System.out.println(e.getAttribute("href"));
       }
       Thread.sleep(50000);
       driver.quit();
       	}
}
