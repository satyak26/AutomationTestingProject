package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Satya karuparthi
 * How to find the elements using selenium webdriver?
 */

public class testElementfindingStrategies {

	public static void main(String[] args) throws InterruptedException {
//		 Auto setup chrome browser driver
		WebDriverManager.chromedriver().setup();
//        Initialize browser
       WebDriver driver =  new ChromeDriver();
       driver.get("https://www.facebook.com/login/");
       Thread.sleep(2000);
       highlight(driver,driver.findElement(By.id("email")));
       Thread.sleep(2000);
       highlight(driver,driver.findElement(By.name("pass")));
       Thread.sleep(2000);
       highlight(driver,driver.findElement(By.className("_97vy")));
       Thread.sleep(2000);
       highlight(driver,driver.findElement(By.linkText("Forgotten account?")));
       Thread.sleep(2000);
       highlight(driver,driver.findElement(By.partialLinkText("Sign up")));
       Thread.sleep(2000);
//       highlight(driver,driver.findElement(By.tagName("h1")));
       highlight(driver,driver.findElement(By.xpath("//*[@id=\"header_block\"]/span/div")));
       Thread.sleep(2000);
       highlight(driver,driver.findElement(By.cssSelector("#loginbutton")));
       Thread.sleep(2000);
//     Close browser
       driver.quit();  
	}
public static void highlight(WebDriver driver, WebElement element) {
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
jsExecutor.executeScript("arguments[0].setAttribute('style', " + "'border:2px solid red; background:yellow')", element);
}
}

