package Screenshort;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShort2 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sures\\eclipse-workspace\\Seleniam\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		TakesScreenshot tk=(TakesScreenshot)driver;

	WebElement x = driver.findElement(By.xpath("//button[text()='✕']"));
	x.click();
	File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f=new File("C:\\Users\\sures\\eclipse-workspace\\Seleniam\\ScreenShort\\face1.png");
		FileUtils.copyFile( screenshotAs, f);
		
		
		//driver.quit();
		
		
		
		
	}

}
