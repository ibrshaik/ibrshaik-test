package com.java.ibshaik;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {
			public static void main(String[] args) {
				System.out.println("enter the string input to be tokenized");
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				int count= 0;
				ArrayList<String> list = new ArrayList<String>();
				
				String regex = "([ !,?._'@])";
				StringTokenizer tokens = new StringTokenizer(s,regex);
				
				while(tokens.hasMoreTokens()){
					list.add( (String) tokens.nextToken());
					count++;
				}
				System.out.println(count);
				for(String list1 : list){
					System.out.println(list1);
				}
				
				
				sc.close();
				
			}
}
