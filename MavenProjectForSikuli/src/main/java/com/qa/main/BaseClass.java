package com.qa.main;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties ps;
	
	public BaseClass() throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\Home\\eclipse-workspace\\MavenProject002\\config.properties");
		ps= new Properties();
		ps.load(fs);
		
	}
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\MavenProject002\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.MILLISECONDS);
		String appUrl = ps.getProperty("webappurl");
		driver.get(appUrl);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement NoThanksButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'No, thanks!')]")));
		NoThanksButton.click();
	}
	


}
