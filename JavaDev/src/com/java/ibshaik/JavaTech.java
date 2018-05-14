package com.java.ibshaik;
import java.util.Scanner;

public class JavaTech {

	public static void main(String[] args) {
		System.out.println("enter the input string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
    	String upperCaseChars = "(.*[A-Z].*)";
		String lowerCaseChars = "(.*[a-z].*)";
		String numeric = "(.*[0-9].*)";
		String special = "(.*[#,$,*].*)";
		//String input = "6 Test$8";
		String[] iArray = input.split("\\s+");
		System.out.println("Given input is: "+input);
		if(iArray.length==1)
		{
			
			System.out.println("given String "+iArray[0]+" is invalid");
		
		}
		else if(iArray.length==2)
		{
			
			String  str = iArray[0];
			String word = iArray[1];
			int count = Integer.parseInt(str);
			if(count==word.length())
			{
				System.out.println("given word count and the number both are equal so we can proceed");
				
				if(word.matches(upperCaseChars))
				  {
					System.out.println(" give word is havng a uppercase chars");
				   if(word.matches(lowerCaseChars))
					  {
					   System.out.println("given word is having lowercase chars");
						if(word.matches(numeric))
						  {
							System.out.println("given word is having numbers");
					         if(word.matches(special))
					         {
					        	 System.out.println("given word is having special chars");
					        	 
					        	 if(!word.substring(0,1).matches(special))
					        	 {
					        	 
					        		 System.out.println("given string has both capital,small caps,numeric and speacial characters and it is validated");
					         
					        	 }
					        	 else
								  {
									System.out.println(" word should at least one a-z,A-Z, numeric and special character and it should not start with special character");
								  }
					         }
						     
						  }
				      }
				  }
				
				
				
			}
			else
			 {
				 System.out.println("given number and word count both are not equal");
			 }
		}
		else 
		{
			
			System.out.println("the given string is not in required format");
			
		}
	}

}
