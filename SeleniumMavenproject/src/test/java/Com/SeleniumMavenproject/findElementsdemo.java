package Com.SeleniumMavenproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author Satya karuparthi
 * How to handle find Elements using Selenium WebDriver?
 */
public class findElementsdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(2000);
//findElement
/*
 * Locating the 'Login' button and retrieve the label text on the button--use find Element
 */
      WebElement loginbutton = driver.findElement(By.xpath("//button[@value='LogIn']"));
      System.out.println(" ");
      System.out.println(loginbutton.getSize());
        String textOnLoginButton = loginbutton.getText();
        System.out.println(textOnLoginButton); 
//findElements
/*
 * Locating the options in multi-selection boox field and retrieve all the options text --use find Elements
 */
  List<WebElement> MultiOptions = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
  System.out.println(" ");
  System.out.println("Total Count: "+MultiOptions.size());
  System.out.println("Multi list");
  System.out.println("__________");
  for(WebElement option : MultiOptions) {
	System.out.println(option.getText());
		}
		
//findElements
/*
* Locating a set of hyperlinks under a section and printing their link text--use find Elements
*/
	List<WebElement> hyperlinksMultiOptions = driver.findElements(By.xpath("//div[@id='LinkList1']//a"));
	   System.out.println(" ");
	   System.out.println("Total Count: "+hyperlinksMultiOptions.size());
	   System.out.println("Multi Hyper Links list");
	   System.out.println("__________");
		for(WebElement hyperlinkoption : hyperlinksMultiOptions) {
			System.out.println(hyperlinkoption.getText());
				}
		
//findElements
/*
* Locating all the hyperlinks on the web page and retrieving their href attribute values--use find Elements
*/

   List<WebElement> allHyperLinks = driver.findElements(By.xpath("//a"));
   System.out.println(" ");
   System.out.println("Total Count: "+allHyperLinks.size());
   System.out.println("All Hyper Links list");
   System.out.println("__________");
   for(WebElement allLinks : allHyperLinks) {
   System.out.println(allLinks.getAttribute("href"));
    }
       driver.quit();
	}

}
