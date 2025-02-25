package org.base;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethod {
	public static WebDriver driver;

	public static WebDriver browserlauch(String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void geturl(String a) {
		driver.get(a);
	}

	public static void SendKeys(WebElement e, String a) {
		e.sendKeys(a);
	}

	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String attribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static void implicitywait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);

	}

	public static void moveToElement(WebElement b) {
		Actions a = new Actions(driver);
		a.moveToElement(b).perform();
	}

	public static void Selectbytext(WebElement a, String b) {
		Select s = new Select(a);
		s.selectByVisibleText(b);

	}
	public static void Selectbyindex(WebElement a, int b) {
		Select s = new Select(a);
		s.selectByIndex(b);
}
//	public static void screenshot(WebElement f1, String F2) {
//		TakesScreenshot tk=(TakesScreenshot)driver;
//		File f1=tk.getScreenshotAs(OutputType.FILE);
//		File f2=new File("C:\\Users\\sures\\eclipse-workspace\\Cucumber_Dummy\\src\\main\\Screenshot.png");
//		FileUtils.copyFile(f1, f2);
//		
//	}
	public static void brokenurl(String linkUrl) throws IOException {
		URL u=new URL(linkUrl);
		HttpURLConnection  o = (HttpURLConnection) u.openConnection();
		o.setConnectTimeout(500);
		o.connect();
		

	}
     
}