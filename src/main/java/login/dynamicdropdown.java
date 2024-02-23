package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		// Lanuch Url
		
		driver.get("https://www.google.com/");
		// enter Hari in text box
		 driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("hari");
		 Thread.sleep(3000);		
		 List<WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		 // get size
		 System.out.println(auto.size());
		// to get text 
		 for(WebElement options :auto) {
				System.out.println(options.getText());
			}
	int s = auto.size();
		System.out.println(s);
		auto.get(2).click();
		
		


		}
		
		
	
	}


