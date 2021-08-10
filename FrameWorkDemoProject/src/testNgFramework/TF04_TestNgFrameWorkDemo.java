package testNgFramework;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class TF04_TestNgFrameWorkDemo {

	static WebDriver driver;
	WebElement searchField;
	
	@BeforeClass
	public static void beforeClass() {
		
		File dr = new File("projectData");
		File chromeDriver = new File(dr, "chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());
		driver = new ChromeDriver();
		
	}
	
	@AfterClass
	public static void afterClass() {
		
		driver.quit();
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		driver.manage().window().maximize(); // Maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://www.google.com/");
		
		searchField = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		
	}
	
	@AfterMethod
	public void afterTest() {
		
	}
	
	@Test
	public void indiaSearchTest() throws Exception {
		
		searchField.sendKeys("India");
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Verify.verify(driver.getCurrentUrl().contains("India"));
		//Verify.verify(driver.getCurrentUrl().contains("india"));
		System.out.println("India Search Test Pass.");
		
	}
	
	@Test
	public void canadaSearchTest() throws Exception {
		
		searchField.sendKeys("Canada");
		searchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Assert.assertTrue(driver.getCurrentUrl().contains("Canada"));
		System.out.println("Canada Search Test Pass.");
		
	}
	
}
