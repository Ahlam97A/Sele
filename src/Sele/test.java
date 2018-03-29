package Sele;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	
	 static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	     driver= new FirefoxDriver();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		driver.get("http://www.facebook.com");
	     driver.manage().window().maximize();

	     driver.findElement(By.id("email")).sendKeys("ahlamkharrousheh@hotmail.com");
	     driver.findElement(By.id("pass")).sendKeys("*****");
	     driver.findElement(By.id("u_0_2")).click();
	     
	}

}
