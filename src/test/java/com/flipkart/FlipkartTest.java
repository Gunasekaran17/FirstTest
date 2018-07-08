package com.flipkart;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartTest{
	
	//public static void main (String [] args) {
	
	@Test
	
	void IniatiatingBrowsertest() {
		
	//public static void main(String [] args) {
	File filename = new File("G:\\\\Automation\\\\chromedriver.exe");
	        System.setProperty("webdriver.chrome.driver", filename.getAbsolutePath());
		//System.setProperty("webdriver.chrome.driver", "‪G:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
	}
	//}
	
	
	
}