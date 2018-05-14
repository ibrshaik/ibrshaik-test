package com.java.ibshaik;

import java.util.Scanner;

public class PasswordValidator {
	
	

	public static void main(String[] args) {
		System.out.println(" enter the password for validation in required format");
		Scanner sc = new Scanner(System.in);
		String input_string = sc.nextLine();
		String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$#!*&^%]).{4,}";
		PasswordValidator validator = new PasswordValidator();
		String[] input = input_string.split(" ");
		try{
				 //if(input.length == 2){
					int count = Integer.parseInt(input[0]);
					String passwd = input[1];
					if(count == passwd.length()){
						if(passwd.matches(pattern)){
							if(passwd.substring(0, 1).matches("(.*[#,$,*,!,%].*)")){
								System.out.println("password shouldn't start with special cahr");
								
							}else {
								validator.stringSwap(passwd);
							}
							
						}else{
							System.out.println("given password must have an uppercase char, lowercase char, numberic number and a special char");
						}
						
						
					}else{
						System.out.println("both the number and word count are not matching, String is invalid");
					}
					
				//}
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}
	
	public void stringSwap(String swap){
		int length = swap.length();
		char[]ch = swap.toCharArray();
		for(int i=0;i<length-1;i=i+2){
			
			char temp = ch[i];
			ch[i] = ch[i+1];
			ch[i+1] = temp;
		}
		
		String str = new String(ch);
		StringBuilder strb = new StringBuilder(str);
		StringBuilder reverse = strb.reverse();
		
   
		System.out.println("given pasword is validated and the output format is "+reverse);
		
	}
}
