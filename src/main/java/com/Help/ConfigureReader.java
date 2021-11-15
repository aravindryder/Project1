package com.Help;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigureReader {

	public static Properties p;
	
	public String url() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String url = p.getProperty("url");
		
		return url;
	}

	public String username() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();

		p.load(file);
		
		String username = p.getProperty("username");
		
		return username;
	}

	public String password() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String password = p.getProperty("password");
		
		return password;
	}
	
	public String firstname() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String firstname = p.getProperty("firstname");
		
		return firstname;
	}
	
	public String lastname() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String lastname = p.getProperty("lastname");
		
		return lastname;
	}
	
	public String address() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String address = p.getProperty("address");
		
		return address;
	}
	
	public String card() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String card = p.getProperty("card");
		
		return card;
	}
	
	public String cvv() throws Throwable {
		
		File f = new File("C:\\Users\\Flynn Ryder\\eclipse-workspace\\MiniProject3\\src\\main\\java\\com\\Config\\Properties\\Configration.Properties");
		
		FileInputStream file = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(file);
		
		String cvv = p.getProperty("cvv");
		
		return cvv;
	}
}