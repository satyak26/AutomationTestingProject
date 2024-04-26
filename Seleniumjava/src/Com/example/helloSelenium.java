package Com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class helloSelenium {

	public static void main(String[] args) throws InterruptedException {
//		Auto setup chrome browser driver
		WebDriverManager.chromedriver().setup();
//			Set Driver path
//System.setProperty("webdriver.chrome.driver","C:\\Users\\SatyaKaruparthi\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		Initialize browser
		WebDriver driver = new ChromeDriver();
//		google browser open
		driver.get("https://www.google.com/");
//        Maximize browser
		driver.manage().window().maximize();
//        Waiting browser
        Thread.sleep(30000);
//        Close browser
        driver.close();
	}

}
