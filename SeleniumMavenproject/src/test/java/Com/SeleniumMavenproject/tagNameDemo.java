package Com.SeleniumMavenproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Satya karuparthi
 * Locating all the elements having the input tag on the web page and printing their type
 */
public class tagNameDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //pageLoadTimeouts
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        //TahName
       List<WebElement> inputTagElements = driver.findElements(By.tagName("input"));
//       System.out.println("No of Tag Elements : "+inputTagElements.size());
       for(WebElement e : inputTagElements)
       {
    	   System.out.println(e.getAttribute("type"));
       }
       driver.quit();
       
	}

}
