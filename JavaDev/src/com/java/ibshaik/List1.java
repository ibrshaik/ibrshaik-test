package com.java.ibshaik;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" neter the input");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++){
		   list.add(sc.nextInt());
		}
		int q = sc.nextInt();
		for(int j=0;j<q;j++){
			String s= sc.next();
			if(s.equals("Insert")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x,y);
			}
			if(s.equals("Delete")){
			 int x = sc.nextInt();
			 list.remove(x);
			}
		}
		/*for(int k=0;k<list.size();k++){
			System.out.print(list.get(k));
			System.out.print(" ");
		}*/
		while(!list.isEmpty()){
			System.out.print(list.remove(0) + " ");
		}

	}

}
