package FileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\eclipse-workspace\\Cucumber_Dummy\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		WebElement pdf = driver.findElement(By.xpath("(//span['text()=Select PDF file'])[8]"));
//		pdf.click();
//		Thread.sleep(5000);
		pdf.sendKeys("E:\\New folder\\Resume.pdf");;
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
