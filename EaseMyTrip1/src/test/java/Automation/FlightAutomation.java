package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageclass.Flightpage;

public class FlightAutomation {
	Flightpage fb;
	WebDriver driver;
	
	
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","E:\\selenium java\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		//creation of page class object
		fb=new Flightpage(driver);
		fb.selectFlight();
	}
	
	@Test
	public void OneWay() throws InterruptedException {
			fb.selectOneWay();
			fb.setFrom("Delhi");
			fb.selectFrom();
			fb.setTo("Bangalore");
			fb.selectTo();
			fb.SelectDate();
			fb.SelectDate1();
			//fb.clickRdate();
			//fb.selectRdate();
			fb.selectTraveler();
			fb.clickdone();
			fb.selectclasstype();
			fb.selectdone();
			fb.minimizeChatBox();
			fb.clickSearch();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			fb.selectBooknow();
			//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			//String title=driver.getTitle();
		//Assert.assertTrue(title.contains("EaseMyTrip.com Lowest Airfare"));
			JavascriptExecutor js=(JavascriptExecutor) driver;
			  js.executeScript("window.scroll(0, 700);");
			  fb.selectInsurance();
			  fb.setemail("abc@gmail.com");
			  fb.selectContinue();
			  js.executeScript("window.scroll(0, -700);");
			  //fb.clickpassengerCheckBox();
			  fb.selectTitle();
			  fb.setFirstName("Bharath");
			  fb.setLastName("reddy");
			  fb.setContact("9490733125");
			  js.executeScript("window.scroll(0, document.body.scrollHeight);");
			  Thread.sleep(5000);
			  fb.selectContinueBooking();
			  fb.selectSkip();
	}
	
	/*@Test
	public void RoundTrip() {
		fb.selectOneWay();
		fb.setFrom("Delhi");
		fb.selectFrom();
		fb.setTo("Bangalore");
		fb.selectTo();
		fb.SelectDate();
		fb.SelectDate1();
		fb.clickRdate();
		fb.selectRdate();
		fb.selectTraveler();
		fb.clickdone();
		fb.selectclasstype();
		fb.selectdone();
		fb.minimizeChatBox();
		fb.clickSearch();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		fb.selectBooknow();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("EaseMyTrip.com Lowest Airfare"));
		
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}*/
	

}
