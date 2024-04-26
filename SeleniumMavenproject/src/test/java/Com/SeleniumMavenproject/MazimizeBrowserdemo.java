package Com.SeleniumMavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 *  How to maximize browser window and google.com open at same time in Selenium WebDriver
 */
public class MazimizeBrowserdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		Thread.sleep(3000);
//        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.quit();
	}

}
