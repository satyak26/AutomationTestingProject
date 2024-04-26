package Com.SeleniumMavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
* @author Satya karuparthi
* How to handle url,title,page source using Selenium Webdriver?
*/
public class testApplicationProperties {

	public static void main(String[] args)  throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        
//    URL    
        String getUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " +getUrl);
        System.out.println("Current URL: " +driver.getCurrentUrl());
        
//    Title
        String getTitle = driver.getTitle();
        System.out.println("Title Name: " +getTitle);
        System.out.println("Title Name: " +driver.getTitle());
        
//      htmlPageSource
//        String htmlPageSource = driver.getPageSource();
//        System.out.println("PageSource : " +htmlPageSource);
        driver.quit();
	}

}