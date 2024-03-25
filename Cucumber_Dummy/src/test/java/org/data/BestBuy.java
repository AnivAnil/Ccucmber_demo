package org.data;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.page.PageFacto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BestBuy extends BaseMethod {
	static PageFacto p;
	@Given("User shoud be in in Bestbuy page")
	public void user_shoud_be_in_in_Bestbuy_page() throws InterruptedException {
		browserlauch("chrome");
	   geturl("https://www.bestbuy.com/");
	    p=new PageFacto();
	    Thread.sleep(2000);
	    click(p.getCanada());
	}

	@When("user shoud enter any produt in search  bar")
	public void user_shoud_enter_any_produt_in_search_bar() throws InterruptedException, IOException {
		SendKeys(p.getSearch(),"watch");		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\sures\\eclipse-workspace\\Cucumber_Dummy\\src\\main\\Screenshot.png");
		FileUtils.copyFile(f, f1);
		
		
	  
	}

	@When("click enter button")
	public void click_enter_button() {
	   quit();
	}


}
