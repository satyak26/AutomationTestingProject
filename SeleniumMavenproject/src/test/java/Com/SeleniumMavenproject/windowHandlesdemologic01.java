package Com.SeleniumMavenproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesdemologic01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        System.out.println(driver.getTitle());
//One Window - Original Window
        String originalWindowId = driver.getWindowHandle();
        WebElement orinalWinndowText = driver.findElement(By.id("ta1"));
        orinalWinndowText.sendKeys("Satya Window handling Testing");
        Thread.sleep(3000);
      //Two Windows - Original and New Window
        driver.findElement(By.linkText("Open a popup window")).click();
        //Two Windows
     Set<String> windowIDS = driver.getWindowHandles();
    for (String wd : windowIDS) {
    	 driver.switchTo().window(wd);
    	 String pageTitle = driver.getTitle();
    	 if (pageTitle.equals("New Window")){
    	String textonpage = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
   	 	System.out.println(textonpage);
   	 	driver.close();
    	 }
    }
    driver.switchTo().window(originalWindowId);
	   WebElement textname = driver.findElement(By.name("q"));
	   textname.sendKeys("selenium tutorials");
	   Thread.sleep(3000);
	  driver.quit();
	}

}
