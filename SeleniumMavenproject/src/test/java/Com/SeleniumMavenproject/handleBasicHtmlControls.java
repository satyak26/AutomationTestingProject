package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Satya karuparthi
 * How to handle links,buttons,checkboxes,radiobuttons using selenium webdriver?
 */
public class handleBasicHtmlControls {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		/*driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("malerb")).click();
		Thread.sleep(3000);*/
		 WebElement englishcheckbox = driver.findElement(By.id("englishchbx"));
		 englishcheckbox.click();
		 Thread.sleep(3000);
		 if (englishcheckbox.isSelected()) {
			 englishcheckbox.click();
		 }else {
			 System.out.println("englishcheckbox is not in selection state");
		 }
			driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		System.out.println(driver.findElement(By.id("navigateHome")).getText());
		Thread.sleep(3000);
		driver.quit();
	}
}
