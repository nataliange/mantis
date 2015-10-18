package com.example.fw;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ApplicationManager {
	
	private static ApplicationManager singleton;
	

	private HibernateHelper hibernateHelper;
	private WebDriverHelper webDriverHelper;
	private AccountHelper accountHelper;
	private MailHelper mailHelper;
	private JamesHelper jamesHelper;
	private AdminHelper adminHelper;
	
	private Properties props;

	
	public static ApplicationManager getInstance() {
		if (singleton == null) {
			singleton = new ApplicationManager();
		}
		return singleton;
	}
	
	public void stop() {
		if (webDriverHelper != null) {
			webDriverHelper.stop();
		}
	}
	
	public WebDriverHelper getWebDriverHelper() {
		if (webDriverHelper == null) {
			webDriverHelper = new WebDriverHelper(this);
		}
		return webDriverHelper;	
	}

	///////////
	
	public void setProperties(Properties props) {
		this.props = props;
	}
	
	public String getProperty(String key) {
		return props.getProperty(key);
	}
	
	public String getProperty (String key, String defaultValue) {
		return props.getProperty(key, defaultValue);
	}
	
	public HibernateHelper getHibernateHelper() {
		if (hibernateHelper==null) {
			hibernateHelper = new HibernateHelper(this);
		}
		return hibernateHelper;	
	}

	public AccountHelper getAccountHelper() {
		if (accountHelper==null) {
			accountHelper = new AccountHelper(this);
		}
		return accountHelper;
	}

	public MailHelper getMailHelper() {
		if (mailHelper==null) {
			mailHelper = new MailHelper(this);
		}
		return mailHelper;
	}

	public JamesHelper getJamesHelper() {
		if (jamesHelper==null) {
			jamesHelper = new JamesHelper(this);
		}
		return jamesHelper;
	}
	
	public AdminHelper getAdminHelper() {
		if (adminHelper==null) {
			adminHelper = new AdminHelper(this);
		}
		return adminHelper;
	}

}



