package Ecomerse;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Project {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\eclipse-workspace\\Cucumber_Dummy\\src\\test\\resources\\Driver\\chromedri.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://internalqa1euc1.realizeitglobal.com/RealizeitApp/RealizeIt.aspx?Skin=-1");
		Thread.sleep(5000);
		WebElement logdirectuser = driver.findElement(By.xpath("(//a[@href='#'])[1]"));
		logdirectuser.click();
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("stu1");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("stu123!");
		Thread.sleep(5000);
		WebElement logbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		logbutton.click();
	}
	
	

}
