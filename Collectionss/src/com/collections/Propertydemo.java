package com.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Properties;

import javax.print.attribute.standard.PDLOverrideSupported;

public class Propertydemo {

	public static void main(String[] args) throws FileNotFoundException {
		Properties prp=new Properties();
		FileInputStream fis=new FileInputStream("dta.properties");
		try {
			prp.load(fis);
			String username=prp.getProperty("id");
			String pass=prp.getProperty("pass");
			String city=prp.getProperty("city.name");
			System.out.println(username);
			System.out.println(pass);
			System.out.println(city);
			
			Enumeration en=prp.keys();
			while (en.hasMoreElements()) {
				String s= (String) en.nextElement();
				System.out.println(s);
			}
			System.out.println(prp);
		} catch (Exception e) {
			// TODO: handle exception
		}
		prp.setProperty("uname", "lki");
		
		System.out.println(prp);
		}

	}


