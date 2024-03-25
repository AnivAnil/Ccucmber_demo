

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	public static WebDriver driver;

	@Given("we shoud open the home screen of miniinthebox")
	public void we_shoud_open_the_home_screen_of_miniinthebox() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

	@When("click on iphone")
	public void click_on_iphone() throws InterruptedException {
		driver.get("https://www.miniinthebox.com/");
		Thread.sleep(2000);
		WebElement iphone = driver.findElement(By.xpath("//a[text()='iPhone 13']"));
		iphone.click();
	}

	@When("user whoud print all text of iphone")
	public void user_whoud_print_all_text_of_iphone() throws InterruptedException {
		List<WebElement> Text = driver.findElements(By.xpath("//div[@class='prod-name']"));
		for (int i = 0; i < Text.size(); i++) {
			WebElement text = Text.get(i);
			String text2 = text.getText();
			System.out.println(text2);
		}
	}

	@Then("user shoud click any product")
	public void user_shoud_click_any_product() throws InterruptedException {
		Thread.sleep(2000);
	 driver.findElement(By.xpath("//img[@id='8449344']")).click();
		

	}


@Then("we need to add in cart")
public void we_need_to_add_in_cart() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//span[@data-value='129154']")).click();
		driver.findElement(By.xpath("(//img[@class='sku-img'])[4]")).click();
		WebElement addtocart = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		addtocart.click();
		driver.findElement(By.xpath("//a[@title='CHECKOUT']")).click();
		
	}

	@Then("user shoud enter {string} and {string}")
	public void user_shoud_enter_and(String user, String pass) throws InterruptedException {
		WebElement user2 = driver.findElement(By.id("loginEmail"));
		Thread.sleep(5000);
		user2.sendKeys("user");
		String user1 = user2.getAttribute("<user>");
		System.out.println(user1);

		WebElement pass2 = driver.findElement(By.id("loginPassword"));
		pass2.sendKeys("pass>");
		String pass1 = pass2.getAttribute("value");
		System.out.println(pass1);

		driver.findElement(By.id("popsignInSubmit")).click();
		//driver.quit();
		System.out.println("success");
	}


}