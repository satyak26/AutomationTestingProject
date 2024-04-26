package Com.SeleniumMavenproject;
import org.openqa.selenium.By;
//Ctrl+shift+O--remove unused import statements
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumbasiccommandsdemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
     /* Options options = driver.manage();
      Window window = options.window();
      window.maximize();*/
        //Short form above statements//
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
//        driver.manage().window().minimize();
       WebElement searchBoxField = driver.findElement(By.name("search"));
       searchBoxField.click();
       searchBoxField.sendKeys("HP");
     //        driver.findElement(By.name("search")).click(); //Shortform
//     driver.findElement(By.name("search")).sendKeys("HP"); //Shortform
//     driver.findElement(By.xpath("//Button[contains(@class,'btn btn-default')]")).click();//Shortform
		WebElement searchButton = driver.findElement(By.xpath("//Button[contains(@class,'btn btn-default')]"));
		searchButton.click();
	WebElement hpProductLink = driver.findElement(By.linkText("HP LP3065"));
	boolean productDisplayStatus = hpProductLink.isDisplayed();
	 if(productDisplayStatus){
		 System.out.println("Test Pass");
	 }
	 else{
		 System.out.println("Test Failed");
	 }
//	 driver.findElement(By.linkText("HP LP3065")).isDisplayed();
		WebElement myAccountDropMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccountDropMenu.click();
		Thread.sleep(3000);
		 WebElement loginOption = driver.findElement(By.linkText("Login"));
		 loginOption.click();
		 WebElement emailAddrField = driver.findElement(By.id("input-email"));
		 emailAddrField.click();
		 emailAddrField.sendKeys("satyahgcc45@gmail.com");
		 WebElement passwordField = driver.findElement(By.id("input-password"));
		 passwordField.click();
		 passwordField.sendKeys("657345");
		 passwordField.submit();//or belowCode//
//		 WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
//		 loginButton.click(); 
		/* WebElement editYourAccountInfo = driver.findElement(By.linkText("Edit your account information"));
		 editYourAccountInfo.isDisplayed();
		 boolean accountDisplayStatus = editYourAccountInfo.isDisplayed();
		 if(accountDisplayStatus){
			 System.out.println("User got logged in Successfully: Test Passed");
		 }
		 else{
			 System.out.println("User got Failed: Test Failed");
		 }*/
		 
	}
}
