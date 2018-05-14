package com.java.ibshaik;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			String name = sc.nextLine();
			int num = sc.nextInt();
			
			map.put(name,num);
			sc.nextLine();
		}
		while(sc.hasNext())
	       {
	           String query =sc.nextLine().trim();
	           System.out.println(map.containsKey(query) ? query+"="+map.get(query) : "Not found");
	       }
		
		
	}

}
