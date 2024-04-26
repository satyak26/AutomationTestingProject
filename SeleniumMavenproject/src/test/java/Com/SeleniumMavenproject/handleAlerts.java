package Com.SeleniumMavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Satya karuparthi
 * How to handle alerts in a web page using Selenium WebDriver?
 */
public class handleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(3000);
		
//Alert box
		System.out.println("Statring print text: "+ driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
//Confirm Box--OK
		System.out.println("Statring confirm box Ok print text: "+ driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
//Confirm Box--Cancel
		System.out.println("Statring confirm box Cancel print text: "+ driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());

//Prompt Box--OK
		System.out.println("Statring promptBox box Ok print text: "+ driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
//		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Selenium Alerts Methods");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());

//Prompt Box--Cancel
		System.out.println("Statring promptBox box Cancel print text: "+ driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
