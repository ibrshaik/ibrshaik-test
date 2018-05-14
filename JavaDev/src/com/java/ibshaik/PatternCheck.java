package com.java.ibshaik;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternCheck {
   public static void main(String[] args) {
	System.out.println(" enter the number of test cases");
	Scanner sc = new Scanner(System.in);
	int testcases = Integer.parseInt(sc.nextLine());
	for(int i=0;i<testcases;i++)
	  {
	      try
	      {
	      String pattern = sc.nextLine();
	      Pattern.compile(pattern);
	      System.out.println("Valid");
	      }

	         catch (Exception e)
	              {
	      System.out.println("Invalid");
	         //Write your code
	  }
   }

}
}