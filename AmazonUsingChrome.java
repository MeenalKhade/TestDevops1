package DevopsAssignment;

import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonUsingChrome {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		String baseurl= "https://www.amazon.in";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoft\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); 
		
		driver.get(baseurl);
		Thread.sleep(4000);
				
		WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(ddown);
		select.selectByVisibleText("Books");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	
	}

}