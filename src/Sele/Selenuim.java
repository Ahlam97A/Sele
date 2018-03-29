package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenuim {

 public static void main(String [] args) 

 {
	 //String exePath = "‪‪C:\\geckodriver.exe";
     System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

	 
     WebDriver driver = new FirefoxDriver();
     
     driver.get("http://www.facebook.com");
     driver.manage().window().maximize();

     driver.findElement(By.id("email")).sendKeys("ahlamkharrousheh@hotmail.com");
     driver.findElement(By.id("pass")).sendKeys("****");
     driver.findElement(By.id("u_0_2")).click();
    
 }
}