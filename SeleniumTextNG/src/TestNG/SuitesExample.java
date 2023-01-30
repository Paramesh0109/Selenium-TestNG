package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitesExample {
	WebDriver driver;
	Long Start;
	Long End;
	@BeforeSuite
	public void chrome() {
		Start = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void StaffDesk() {
		driver.get("https://staffdesk.ftxtradingsoftware.com");		
	}
	@Test(priority = 1)
	public void Buyer() {
		driver.get("https://buyer.ftxtradingsoftware.com");
	}
	@Test(priority = 2)
	public void Activation() {
		driver.get("http://activationcall.ftxtradingsoftware.com");

	}
	@AfterSuite
	public void closebrowser() { 
		End = System.currentTimeMillis();
		driver.quit();
		Long totaltime = Start - End;
		System.out.println("Running time is : " +totaltime);	
	}

}
