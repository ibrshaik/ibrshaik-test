package com.java.ibshaik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //String pattern  = "(/d{1,3}./d{1,3}./d{1,3}./d{1,3})";
       Pattern ptr  = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-6])\\."+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
       Matcher mtch = ptr.matcher("257.125.225.255");
       System.out.println(mtch.find());
       
             
		
		
		
		
	}

}
