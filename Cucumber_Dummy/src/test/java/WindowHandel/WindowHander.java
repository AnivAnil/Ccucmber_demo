package WindowHandel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHander {
	public static void main(String[] args) {
		System.setProperty("webdriver,chrome,driver", "Location");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l=new  LinkedList<String>();
		l.addAll(windowHandles);
		driver.switchTo().window(l.get(2));
		
	

	    
	
			
		
		
		
		
		
	}
	}
