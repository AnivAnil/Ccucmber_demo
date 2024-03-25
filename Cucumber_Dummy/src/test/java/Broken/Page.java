package Broken;

import java.util.List;

import org.base.BaseMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Page extends BaseMethod {
	public Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(tagName = "a")
	private List<WebElement> link;

	public List<WebElement> getLink() {
		return link;
	}

}
