package com.crm.XpathandHtml;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Xpathcase1 
{
	@Test
	public void xpathcase1()
	{
		
       //System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file://C:/Users/Madhu/Desktop/xpathclass1.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("madhu");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("megha");
		driver.findElement(By.xpath("/html/body/input[3]")).click();
		
		
		
	}

}
