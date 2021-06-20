package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.main.BaseClass;

public class SimpleFormPage extends BaseClass {

	public SimpleFormPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='user-message']")
	WebElement SimpleFormInputBox;
	
	public void sendInput(String dataExt) {
		SimpleFormInputBox.sendKeys(dataExt);
	}
	

}
