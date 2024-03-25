package Broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.base.BaseMethod;
import org.bouncycastle.util.encoders.UrlBase64;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class BrokenLink extends BaseMethod{
	@When("user shoud find list of webelements")
	public void user_shoud_find_list_of_webelements() throws IOException, InterruptedException {
		browserlauch("chrome");
		implicitywait(20);
		geturl("https://www.amazon.in/");
		Page p=new Page();
		List<WebElement> link = p.getLink();
		System.out.println("All inks "+link.size());
		
		for (int i=0;i<link.size();i++) {
			WebElement links = link.get(i);
			String l = links.getAttribute("href");
			System.out.println("1");
			URL u =new URL(l);
			HttpURLConnection o = (HttpURLConnection) u.openConnection();
			o.connect();
			Thread.sleep(2000);
			int responseCode = o.getResponseCode();
			if(responseCode>=400) {
				System.out.println(l+"broken link");
			}
			else {
				System.out.println(l+"is valid link");
			}
			
		}
		
		
		System.out.println("done");
		
		
		
		
		
		
		
		

		
		quit();
}

	
}