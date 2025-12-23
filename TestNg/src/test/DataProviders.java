package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test(dataProvider="getData")
	public void loginFunctionality(String userName,String Password) {
		
		System.out.println(userName);
		System.out.println(Password);
		
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object [][] obj = new Object[4][2];
		obj[0][0]= "FirstSetUsername";
		obj[0][1]= "FirstSetPassword";
		obj[1][0]= "SecondSetSetUsername";
		obj[1][1]= "SecondSetPassword";
		obj[2][0]= "ThirdSetSetUsername";
		obj[2][1]= "ThirdSetPassword";
		obj[3][0]= "FourthSetSetUsername";
		obj[3][1]= "FourthSetPassword";
		
		return obj;
		
	}
	
	// we have two types of parametirization one of from textng xml file and another is using data provider
	// by using dataprovider we can get muliple sets of data while executing single method 
	// each loop we get different sets of data
	
	
	
}
