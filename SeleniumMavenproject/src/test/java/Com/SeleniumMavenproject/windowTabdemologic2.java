package Com.SeleniumMavenproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowTabdemologic2 {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        System.out.println("Original tab : "+ driver.getTitle());
//One Tab - Original tab
        String originalWindowId = driver.getWindowHandle();
        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(3000);
        //Two tabs
     Set<String> windowIDS = driver.getWindowHandles();
    for (String wd : windowIDS) {
    	 driver.switchTo().window(wd);
     	 if (!wd.equals(originalWindowId)){
        System.out.println("New Tab : "+driver.getTitle());
   	 	driver.close();
    	 }
    }
    driver.switchTo().window(originalWindowId);
    System.out.println("Original tab : "+ driver.getTitle());
	   Thread.sleep(3000);
	  driver.quit();
	}}
