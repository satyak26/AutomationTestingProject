package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newWindowFeature {
   public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        WebElement findtext = driver.findElement(By.id("ta1"));
        findtext.sendKeys("Satya Window handling Testing");
      String getenteredtext = findtext.getText();
      String originalWindowId = driver.getWindowHandle();
      System.out.println(getenteredtext);
        Thread.sleep(3000);
        
       driver.switchTo().newWindow(WindowType.WINDOW);//(WindowType.TAB);
        driver.get("https://tutorialsninja.com/demo/");
        WebElement searchElement = driver.findElement(By.name("search"));
        searchElement.sendKeys("HP");
        String searchElementText = searchElement.getText();
        System.out.println(searchElementText);
        Thread.sleep(3000);
        driver.close();
        
        driver.switchTo().window(originalWindowId);
 	   	driver.findElement(By.name("q")).sendKeys("selenium tutorials");
 	   	Thread.sleep(3000);
 	   	driver.quit();
    }}
