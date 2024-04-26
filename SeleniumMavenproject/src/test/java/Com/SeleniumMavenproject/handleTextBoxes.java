package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Satya karuparthi
 * How to handle the text boxes using selenium webdriver?
 */
public class handleTextBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement userNametext = driver.findElement(By.id("login_field"));
		if(userNametext.isDisplayed()) {
			if(userNametext.isEnabled()) {
				userNametext.sendKeys("satyaTest");
				String enteredText = userNametext.getAttribute("value");
				System.out.println(enteredText);
				Thread.sleep(3000);
				userNametext.clear();
			}else {
				System.err.println("username textbox is not enabled");
			}
		}else{
			System.err.println("username textbox is not diasplayed");
		}
		WebElement labeltext = driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/label"));
		String enterLableText = labeltext.getText();
		System.out.println(enterLableText);
		driver.quit();
	}
}
