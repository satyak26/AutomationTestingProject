package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * 2. Perform Mouse Hover Action on the Web Element
Test Scenario: Perform Mouse Hover on Live Tab and App Automate Tab on the Browserstack Website.
 */
public class mouseHover {

   public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.browserstack.com/");
       WebElement live= driver.findElement(By.xpath("//*[@id=\"product-tab-content0\"]/div[1]/div/div/a[1]/span[1]/h4"));    
       Actions action = new Actions(driver);
//build()- used to compile all the actions into a single step 
       action.moveToElement(live).build().perform();
System.out.println(live.getText());
Thread.sleep(4000);
//WebElement automate= driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']"));
WebElement automate= driver.findElement(By.xpath("//*[@id=\"product-tab-content0\"]/div[2]/div/div/a[2]/span[1]/h4"));  
action.moveToElement(automate).build().perform();
System.out.println(automate.getText());
Thread.sleep(2000);
driver.quit();  
   }
  
}