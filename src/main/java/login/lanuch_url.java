package login;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericutility.fatchdata;
import io.github.bonigarcia.wdm.WebDriverManager;

public class lanuch_url {
		
	public static void main(String[] args) throws Throwable
	{
			
		WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			// Lanuch Url
			
			driver.get("https://artoftesting.com/samplesiteforselenium");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			// Text box
			driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("harika",Keys.ENTER);
			// Radio button
			driver.findElement(By.id("female")).click();
			// check box
			driver.findElement(By.xpath("//*[@type='checkbox']")).click();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			// Scrooldown
			jse.executeScript("window.scrollBy(0,1000);");
			// Alert box to accept
			driver.findElement(By.xpath("//*[.='Generate Alert Box']")).click();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();			
			// Scrooldown
			jse.executeScript("window.scrollBy(0,1000);");
			// Static Dropdown
		WebElement drop = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
			Select s = new Select(drop);
			// by visibleText
			s.selectByVisibleText("Performance Testing");
			// By Index
			s.selectByIndex(2);
			//by Value
			s.selectByValue("Automation");
			// comfirm box
			
			driver.findElement(By.xpath("//*[.='Generate Confirm Box']")).click();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			jse.executeScript("window.scrollBy(0,1000);");
			// Drag and Drop
			 WebElement d = driver.findElement(By.xpath("//*[@id='myImage']"));
			
			 Actions a = new Actions(driver);
			 a.doubleClick(d).perform();		
			 WebElement s1 = driver.findElement(By.xpath("//*[@id='myImage']"));
			 WebElement d1 = driver.findElement(By.id("targetDiv"));		 
			 a.dragAndDrop(s1, d1).perform();
			
		

		}
	
	}



