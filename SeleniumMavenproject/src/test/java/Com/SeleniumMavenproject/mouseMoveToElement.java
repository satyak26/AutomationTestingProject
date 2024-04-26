package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * 1. Perform Click Action on the Web Element
Test Scenario: Visit the Browserstack home page and click on the Get Started Free button.
 */
public class mouseMoveToElement {

	public static void main(String[] args) throws InterruptedException   {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Get started free"));
		Thread.sleep(2000);
		 System.out.println(element.getText());
 //moveToElement(): Shifts the mouse pointer to the center of the element
		 System.out.println(element.getAttribute("href"));
		action.moveToElement(element).click().perform();
		WebElement performtext = driver.findElement(By.className("heading"));
		 System.out.println(performtext.getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
