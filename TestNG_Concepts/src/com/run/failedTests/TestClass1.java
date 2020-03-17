package com.run.failedTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

	public WebDriver driver = null;

	@Test(priority = 1)
	public void test1() {
		driver.get("https://test-views.vspl.net/Views.Web.DATA/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void test2() {
		driver.findElement(By.xpath("test")).click();
	}

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}