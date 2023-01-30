package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoadTimeCalculates {
	
	@Test
	public void StaffDesk() {
		Long start = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staffdesk.ftxtradingsoftware.com");	
		driver.quit();
		Long end = System.currentTimeMillis();
		Long totaltime = start - end;
		System.out.println("Running time is : " +totaltime);
	}
	@Test
	public void Buyer() {
		Long start = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://buyer.ftxtradingsoftware.com");
		driver.quit();
		Long end = System.currentTimeMillis();
		Long totaltime = start - end;
		System.out.println("Running time is : " +totaltime);
	}
	@Test
	public void Activation() {
		Long start = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IT\\Desktop\\SeleniumLearn\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://activationcall.ftxtradingsoftware.com");
		Long end = System.currentTimeMillis();
		driver.quit();
		Long totaltime = start - end;
		System.out.println("Running time is : " +totaltime);
	}
}
