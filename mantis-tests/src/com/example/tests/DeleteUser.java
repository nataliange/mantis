package com.example.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import com.example.fw.Admin;
import com.example.fw.AdminHelper;


public class DeleteUser extends TestBase {
	
	
	public Admin admin = new Admin().setLogin("administrator").setPassword("root");
	private AdminHelper admHelper;
	
	@BeforeClass
	public void deleteMailUser() {
		admHelper = app.getAdminHelper();
	}
	
	@Test
		public void deleteUser() {
		admHelper.login(admin);
		admHelper.manageUsers();
		admHelper.selectUser();
		admHelper.submitDeletion();
		admHelper.deleteAccount();
	}


}
