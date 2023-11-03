package CucumberPractice2.ParaBank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

public class PropertyClass {
		
	String strUrl,strfname,strlname,stradd,strcity,strstate,strzip,strphone,strssn,struname,strpass,strconfirm;
	public PropertyClass() {
		login2();
	}
	public void login2(){
	File file = new File("C:\\Users\\ashekharangya\\eclipse-workspace\\ParaBank\\src\\test\\resources\\features\\RegisterDetails.properties");
	FileInputStream fileInput = null;
	try {
		fileInput = new FileInputStream(file);
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties prop = new Properties();
	
	try {
		prop.load(fileInput);
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	
	strUrl = prop.getProperty("url");
	strfname = prop.getProperty("fname");
	strlname = prop.getProperty("lname");
	
	stradd = prop.getProperty("address");
	strcity = prop.getProperty("city");
	
	strstate = prop.getProperty("state");
	strzip = prop.getProperty("zipcode");
	strphone = prop.getProperty("phone");

	strssn = prop.getProperty("ssn");
	struname = prop.getProperty("username");
	strpass = prop.getProperty("pass");
	
	strconfirm=prop.getProperty("confirm");

	
	
	
	
	
	
	
	
	
	}
}



