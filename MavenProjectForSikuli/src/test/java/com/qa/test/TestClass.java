package com.qa.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.main.BaseClass;
import com.qa.main.DataProviderClass;
import com.qa.pages.SimpleFormPage;
import com.qa.pages.WelcomePage;

public class TestClass extends BaseClass {
	
	WelcomePage WP;
	SimpleFormPage SFP;
	DataProviderClass DPC;

	public TestClass() throws IOException {
		super();
	
	}
	
	@BeforeClass
	public void setup() {
		System.out.println("I am within Before Class");
		initialization();
	}
	
	@Test
	public void TestCase1() {
		System.out.println("I am within Test Class1");
		
	}
	
	@DataProvider
	public Object[][] dataProviderClass() {
		DPC = new DataProviderClass();
		Object[][] arr2=null;
		try {
			arr2 =  DPC.dataProviderMethod();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return arr2;
		
	}
	
	
	@Test(dataProvider = "dataProviderClass")
	public void TestCase2(String msgtxtNm) throws IOException, InterruptedException {
		System.out.println("I am within Test Class2");
		System.out.println("msgtxtNm" + msgtxtNm);
		WP = new WelcomePage();
		WP.clickMethod();
		SFP = new SimpleFormPage();
		Thread.sleep(2000);
		SFP.sendInput(msgtxtNm);
		
		
	}
	
	//@AfterClass
	public void tearDown() {
		System.out.println("I am within After Class");
		driver.close();
		
	}
	
	

}
