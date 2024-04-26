package Com.SeleniumMavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitingMechanismdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicitlyWait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Global Wait
        driver.get("https://omayo.blogspot.com/");
        
     /*   driver.findElement(By.className("dropbtn")).click();

        //Explicit Wait(WebDriver Wait) using visibilityOfElementLocated
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
        WebElement flipkartClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
        flipkartClick.click();*/
        WebElement checkThisButton = driver.findElement(By.xpath("//button[text() = 'Check this']"));
        checkThisButton.click();
        WebElement TxtBoxContent = driver.findElement(By.xpath("//*//p[text()='The above Mr Option will be enabled in 10 seconds after clicking on below Check this button']"));
        System.out.println(TxtBoxContent.getText());
        //Explicit Wait(WebDriver Wait) using elementToBeClickable
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement elementClickable = wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
        elementClickable.click();
        System.out.println(elementClickable.getAttribute("value"));
        driver.quit();
	}

}
