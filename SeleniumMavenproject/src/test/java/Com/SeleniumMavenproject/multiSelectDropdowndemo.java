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
 * How to handle the Multi-Selection Dropdown using selenium webdriver?
 */
public class multiSelectDropdowndemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideNameDropdown = new Select(ideElement);
		List<WebElement> ideNameDropDownOptions = ideNameDropdown.getOptions();
		for(WebElement ideoption : ideNameDropDownOptions) {
			System.out.println("multi list--- "+ideoption.getText());
		}
		ideNameDropdown.selectByIndex(0);//Eclipse
		Thread.sleep(3000);
		ideNameDropdown.selectByValue("ij");//IntelliJ IDEA
		Thread.sleep(3000);
		ideNameDropdown.selectByVisibleText("Visual Studio");//Visual Studio
		Thread.sleep(3000);
		ideNameDropdown.selectByIndex(3);//NetBeans
		Thread.sleep(3000);
		ideNameDropdown.deselectByIndex(1);
		Thread.sleep(3000);
		List<WebElement> selectedALLOptions = ideNameDropdown.getAllSelectedOptions();
		for (WebElement selectedMultiText : selectedALLOptions) {
			System.out.println("Selected Visibility text--  "+ selectedMultiText.getText());
		}
		driver.quit();
	}
}
