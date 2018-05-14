package com.java.ibshaik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the input string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int c = sc.nextInt();
		String temp1;
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0;(i+c)<=str.length();i++){
			temp1 = str.substring(i,i+c);
			list.add(temp1);
			Collections.sort(list);
		}
		for(int j= 0;j<=list.size()-1;j++){
			if(j==0){
				System.out.println(list.get(j));
			}
			 if(j==list.size()-1){
				System.out.println(list.get(j));
			}
			
	}

}
}
