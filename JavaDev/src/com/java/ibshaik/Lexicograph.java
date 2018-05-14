package com.java.ibshaik;

import java.util.Scanner;

public class Lexicograph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the two strings");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String a1 = a.substring(0, 1).toUpperCase()+a.substring(1);
		String b1 = b.substring(0, 1).toUpperCase()+b.substring(1);
		int length =(a.length()+b.length());
		System.out.println(length);
		int result = a.compareTo(b);
		if(result<0){
			System.out.println("NO");
		}else if(result>0){
			System.out.println("YES");
		}
         System.out.println(a1+" "+b1);
         
      
	}

}
