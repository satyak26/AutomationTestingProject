package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Textelementsfindingclicksdemo {
	/**
	 * @author Satya karuparthi
	 * How to find and click the elements using selenium webdriver?
	 */

	public static void main(String[] args) throws InterruptedException {
//		 Auto setup chrome browser driver
		WebDriverManager.chromedriver().setup();
//       Initialize browser
      WebDriver driver =  new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      Thread.sleep(2000);
//      Maximize browser
     driver.manage().window().maximize();
     Thread.sleep(2000);
      highlight(driver,driver.findElement(By.id("email")));
      Thread.sleep(2000);
      highlight(driver,driver.findElement(By.name("pass")));
      Thread.sleep(2000);
      highlight(driver,driver.findElement(By.className("_97vy")));
      Thread.sleep(2000);
      highlight(driver,driver.findElement(By.xpath("//*[@id=\"header_block\"]/span/div")));
      Thread.sleep(2000);
      driver.findElement(By.linkText("Forgotten account?")).click();
      Thread.sleep(2000);
      driver.findElement(By.cssSelector("#identify_yourself_flow > div > div.uiInterstitialBar.uiBoxGray.topborder > div > div.rfloat._ohf > a")).click();
      Thread.sleep(1000);
      driver.findElement(By.partialLinkText("Sign up")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Already have an account?")).click();
      Thread.sleep(2000);
//      highlight(driver,driver.findElement(By.tagName("h1")));
      driver.findElement(By.cssSelector("#loginbutton")).click();
      Thread.sleep(3000);
//    Close browser
      driver.quit();  
	}
      public static void highlight(WebDriver driver, WebElement element) {
    	  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    	  jsExecutor.executeScript("arguments[0].setAttribute('style', " + "'border:2px solid red; background:yellow')", element);
  
	}

	}

