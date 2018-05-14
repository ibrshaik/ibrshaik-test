package com.java.ibshaik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sam went went  to to his his business";
		String output = "";
		Pattern pattern = Pattern.compile("\\b(\\w+)\\b\\s+\\1\\b");
		Matcher m = pattern.matcher(str);
		if(!m.find()){
			System.out.println("no duplicates");
		}else{
			while(m.find()){
				if(output == ""){
					System.out.println("+++++++++++++++++");
					System.out.println("m.group()is === "+m.group());
					System.out.println("m.group(1)is ==== "+m.group(1));
					output = str.replaceFirst(m.group(),m.group(1));
					System.out.println(output);
				}else{
					
					output = str.replaceAll(m.group(),m.group(1));
					
				}
			
				str = output;
				m = pattern.matcher(str);
				while(m.find()){
					System.out.println("%%%%%%%%%%%%%%%%%%%");
					output = "";
					if(output == ""){
						System.out.println("m.group()is === "+m.group());
						System.out.println("m.group(1)is ==== "+m.group(1));
						output = str.replaceFirst(m.group(),m.group(1));
						System.out.println(output);
					}else{
						System.out.println("output is not null");
						output = str.replaceAll(m.group(),m.group(1));
						
					}
				}
		
				
			}
		}
		
		
	}

}
