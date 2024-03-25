package org.page;

import org.base.BaseMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFacto extends BaseMethod{
	
	public PageFacto() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="(//img[@alt='Canada'])[1]")
	private WebElement canada;

	public WebElement getCanada() {
		return canada;
	}
	@FindBy(name="search")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	
	

}