package com.springerLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class springerTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver = null;
System.setProperty("webdriver.chrome.driver", "E:\\Automation\\work\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		driver.get("https://link.springer.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='query']")).isEnabled();
		driver.findElement(By.xpath("//input[@id='query']")).clear();
		driver.findElement(By.xpath("//input[@id='query']")).sendKeys("Automotive");
		driver.findElement(By.xpath("//input[@id='search']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[@id='number-of-search-results-and-search-terms']")).getText());
	/* close the browser*/
		driver.quit();
	}
}
