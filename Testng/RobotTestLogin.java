package Testng;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotTestLogin {
	
	
	  @Test
	  void Robo() throws Exception {
		  
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://facebook.com");
		 driver.findElement(By.cssSelector("input#email")).sendKeys("Selenium@gmail.com");
		 driver.findElement(By.cssSelector("input#pass")).sendKeys("mukesh");
		 //create Robot class
		 
		 Robot r=new Robot();
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 
	  }
		}