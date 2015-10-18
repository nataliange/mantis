package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.opera.core.systems.OperaDriver;

public class WebDriverHelper { 
	

	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	private final ApplicationManager manager;

	public WebDriverHelper(ApplicationManager manager) {
		this.manager = manager;
		String browser = manager.getProperty("browser");
			if ("firefox".equals(browser)) {
				driver = new FirefoxDriver();
			} else if ("ie".equals(browser)) {
				driver = new InternetExplorerDriver();
			} else if ("chrome".equals(browser)) {
				driver = new ChromeDriver();
			} else if ("opera".equals(browser)) {
				driver = new OperaDriver();
			} else {
				driver = new HtmlUnitDriver();
			}

	}

	public void stop() {
		
	}

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
	

}
