package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.main.BaseClass;

public class WelcomePage extends BaseClass {

	public WelcomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@id = 'treemenu']/preceding::a[contains(text(), 'Input Forms')]")
	WebElement inputForfm;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']/preceding::a[contains(text(),'Simple Form Demo')]")
	WebElement SimpleForm;
	
	public void  clickMethod() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(inputForfm)).click();
		SimpleForm.click();
		
	}

}
