package Com.SeleniumMavenproject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingAjaxCalls {

	public static void main(String[] args)  throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicitlyWait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global Wait
        driver.get("https://omayo.blogspot.com/");
        
    /* driver.findElement(By.className("dropbtn")).click();

//     Explicit Wait(WebDriver Wait) using visibilityOfElementLocated
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
     WebElement flipkartClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
     flipkartClick.click();*/

//Selenium WebDriver in Telugu - Waiting for an alert to be present - Part 61
     driver.findElement(By.id("alert1")).click();
//   Explicit Wait(WebDriver Wait) using alertIsPresent
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   wait.until(ExpectedConditions.alertIsPresent());
   Alert alert = driver.switchTo().alert();
   String textOnAlert = alert.getText();
   System.out.println(textOnAlert);
   Thread.sleep(4000);
   alert.accept();
   driver.quit();
     
	}

}
