package com.example.fw;

import org.openqa.selenium.By;

public class AdminHelper extends HelperWithWebDriverBase {
	
	public AdminHelper(ApplicationManager applicationManager) {
		super(applicationManager);
	}
	
	public void login(Admin admin) {	
		//driver.get(baseUrl + "/mantisbt-1.2.19/login_page.php");
		openUrl("/");
		type(By.name("username"), admin.login);
		type(By.name("password"), admin.password);
		click(By.cssSelector("input.button"));
	}

	public void manageUsers() {
		click(By.linkText("Manage Users"));
	}

	public void selectUser() {
		click(By.linkText("testuser1"));
	}

	public void submitDeletion() {
		click(By.xpath("//input[@value='Delete User']"));
	}

	public void deleteAccount() {
		click(By.cssSelector("input.button"));
		
	}

}
