package Com.SeleniumMavenproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesdemologic02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
//One Window - Original Window
        String originalWindowId = driver.getWindowHandle();
        driver.findElement(By.id("ta1")).sendKeys("Satya Window handling Testing");
        Thread.sleep(3000);
      //Two Windows - Original and New Window
        driver.findElement(By.linkText("Open a popup window")).click();
        //Two Windows
     Set<String> windowIDS = driver.getWindowHandles();
    for (String wd : windowIDS) {
    	 driver.switchTo().window(wd);
 
    	 if (!wd.equals(originalWindowId)){
    	String textonpage = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
   	 	System.out.println(textonpage);
   	 	driver.close();
    	 }
    }
    driver.switchTo().window(originalWindowId);
	   driver.findElement(By.name("q")).sendKeys("selenium tutorials");
	   Thread.sleep(3000);
	  driver.quit();
	}

}
