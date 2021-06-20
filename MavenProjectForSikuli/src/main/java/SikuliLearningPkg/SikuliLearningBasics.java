package SikuliLearningPkg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliLearningBasics {

	public static void main(String[] args) throws FindFailed, InterruptedException  {
		
		Screen screen = new Screen();
	/*	Pattern pattern = new Pattern("C:\\Users\\Home\\Desktop\\SikuliImages\\Capture.PNG");
		
		
		
		screen.click(pattern);
		screen.doubleClick(pattern); */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\eclipse-workspace\\MavenProject002\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Page Load Time out..wait until given time limit to load the page.
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.MILLISECONDS);	//Implicit Wait, Work on entire page element and waiting for each element to load in the page for the given amount of time mention in the code
		driver.get("https://www.seleniumeasy.com/test/");
		//Pattern pattern = new Pattern("C:\\Users\\Home\\Desktop\\SikuliImages\\Capture.PNG");

	}

}
