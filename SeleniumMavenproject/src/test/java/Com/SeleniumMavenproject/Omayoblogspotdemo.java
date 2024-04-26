package Com.SeleniumMavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayoblogspotdemo {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	        driver.get("https://omayo.blogspot.com/");
//	       WebElement selenium143Link = driver.findElement(By.id("link1"));
//	       selenium143Link.click();
	    /*   WebElement txtAreaField = driver.findElement(By.id("ta1"));
	       txtAreaField.click();
	       txtAreaField.sendKeys("This is my Selenium text element practice");
	       WebElement oranageCheckBoxField = driver.findElement(By.id("checkbox1"));
	       oranageCheckBoxField.click();
	       WebElement blueCheckBoxField = driver.findElement(By.id("checkbox2"));
	       blueCheckBoxField.click();
	       WebElement maleRadioboxbutton = driver.findElement(By.id("radio1"));
	       maleRadioboxbutton.click();
	       WebElement textBoxFieldClear = driver.findElement(By.id("textbox1"));
	       textBoxFieldClear.clear();
	       WebElement textElement = driver.findElement(By.xpath("//*[@id=\"HTML43\"]/div[1]/p"));
	       String retrivedText = textElement.getText();
	       System.out.println(retrivedText);
	       String pageTitleone = driver.getTitle();
	       System.out.println(pageTitleone);
	       String pageUrl = driver.getCurrentUrl();
	       System.out.println(pageUrl);
	       WebElement selenium143Link = driver.findElement(By.id("selenium143"));
	       selenium143Link.click();
	       WebElement popupWindowLink = driver.findElement(By.linkText("Open a popup window"));
	       popupWindowLink.click();
	       WebElement searchbuttonattrbtxt = driver.findElement(By.cssSelector("td[class='gsc-search-button']>input"));
	       String textOnButton = searchbuttonattrbtxt.getAttribute("value");
	       System.out.println(textOnButton);
	       WebElement checkDropdownbuttonenabled = driver.findElement(By.className("dropbtn"));
	       boolean state = checkDropdownbuttonenabled.isEnabled();
	       if (state)
	       {
	    	   checkDropdownbuttonenabled.click();  
	       }
	       else{
	    	  System.out.println("Button  is in disabled state");
	       }
	       
	       WebElement disabledButtoncheck = driver.findElement(By.id("but1"));
	       boolean state1 = disabledButtoncheck.isEnabled();
	       if (state1)
	       {
	    	   disabledButtoncheck.click();  
	       }
	       else{
	    	  System.out.println("Button  is in disabled state");
	       } */
		       WebElement oranageCheckBoxField = driver.findElement(By.id("checkbox1"));
		       oranageCheckBoxField.click();
		       WebElement blueCheckBoxField = driver.findElement(By.id("checkbox2"));
		       blueCheckBoxField.click();
	       WebElement blueCheckBox = driver.findElement(By.id("checkbox2"));
	       boolean selectCheckBox = blueCheckBox.isSelected();
	       if (selectCheckBox)
	       {
	    	   System.out.println("blue checkbox is in selection state");  
	       }
	       else{
	    	  System.err.println("blue checkbox is not in selection state");
	       }
	        
	      /* driver.navigate().to("https://www.qafox.com/");
	       Thread.sleep(3000);
	       driver.navigate().refresh();
	       Thread.sleep(3000);
	       driver.navigate().back();
	       Thread.sleep(3000);
	       driver.navigate().forward();*/
		 /*String pageSrccode = driver.getPageSource();
	        System.out.println(pageSrccode);*/
	      /*  WebElement searchBoxTagname = driver.findElement(By.name("q"));
		       String elementTagname = searchBoxTagname.getTagName();
		       System.out.println(elementTagname);
		  Dimension elementSize = searchBoxTagname.getSize();
	       System.out.println(elementSize);
	       System.out.println(elementSize.height);
	       System.out.println(elementSize.width);
	       
			  Point elementloc = searchBoxTagname.getLocation();
		       System.out.println(elementloc);
		       System.out.println(elementloc.x);
		       System.out.println(elementloc.y);
		       
		  Rectangle r = searchBoxTagname.getRect();
		System.out.println(r);
		System.out.println(r.x);
		System.out.println(r.y);      
		System.out.println(r.height);
		System.out.println(r.width);
	System.out.println(r.getX());
	System.out.println(r.getY());
	System.out.println(r.getHeight());
	System.out.println(r.getWidth());
	System.out.println(r.getDimension());
	System.out.println(r.getPoint());
	   WebElement searchBoxCSSValue = driver.findElement(By.id("blogsmenu"));
	   String elementCSSName = searchBoxCSSValue.getCssValue("line-height");
	System.out.println(elementCSSName);*/
//	        driver.manage().window().fullscreen();
	     /*   Dimension d= new Dimension(300,750);
	        driver.manage().window().setSize(d);  
	        String getClassName = driver.getClass().getSimpleName();
	        System.out.println(getClassName);
	        driver.manage().window().setSize(d); */
	       Thread.sleep(3000);
	       //closed close browser window
//	       driver.close();
//	     Close browser for all windows
	       driver.quit();  
	}
}
	