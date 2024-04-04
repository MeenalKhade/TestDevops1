package DevopsAssignment;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonUsingFirefox {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		String baseurl= "https://www.amazon.in";
	
		System.setProperty("webdriver.gecko.driver","C:\\Seleniumsoft\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(baseurl);
		//Thread.sleep(4000);
				
		WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(ddown);
		select.selectByVisibleText("Books");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}

}
