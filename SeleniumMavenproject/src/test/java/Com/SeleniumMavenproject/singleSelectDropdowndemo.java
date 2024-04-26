package Com.SeleniumMavenproject;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * @author Satya karuparthi
 * How to handle the Single-Selection Dropdown using selenium webdriver?
 */
public class singleSelectDropdowndemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		List<WebElement> courseNameDropDownOptions = courseNameDropdown.getOptions();
		for(WebElement option : courseNameDropDownOptions) {
			System.out.println("getOptions--- "+option.getText());
		}
		courseNameDropdown.selectByIndex(1);//java
		Thread.sleep(3000);
		courseNameDropdown.selectByIndex(2);//Dot Net//courseNameDropdown.selectByValue("net");//Dot Net
		Thread.sleep(3000);
		courseNameDropdown.selectByVisibleText("Javascript");//Javascript//courseNameDropdown.selectByIndex(4);
		Thread.sleep(3000);
		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected Visibility text--  "+selectedText);
		driver.quit();
	}
}

