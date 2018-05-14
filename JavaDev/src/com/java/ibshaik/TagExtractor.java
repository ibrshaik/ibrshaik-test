package com.java.ibshaik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input  = "<h1>Nayeem loves counseling</h1>";
		int count = 0;
		String pattern = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
		//Pattern p = Pattern.compile("\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>");
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		
		
		while(m.find())
	    {
	    	
	        System.out.println(m.group(2));
	        count++;
	    }
	    if(count == 0){
	        System.out.println("None");
	    }
		
		/*String pattern = "\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";
		 	int count = 0;

		    Pattern p = Pattern.compile(pattern);
		    Matcher m =  p.matcher(input);
		   

		    while(m.find())
		    {
		        System.out.println(m.group(2));
		        count++;
		    }
		    if(count == 0){
		        System.out.println("None");
		    }
*/
	}

}
