package com.java.ibshaik;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {

	public static void main(String[] args) {
		System.out.println("enter the input  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for(int i=0;i<n;i++){
			int d =sc.nextInt();
			System.out.println("i value is "+i+" and n value is "+n);
			System.out.println("d vaule is "+d);
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=0;j<d;j++){
				
				list.add(sc.nextInt());
			}
			lists.add(list);
			System.out.println(list);
		}
      int q = sc.nextInt();
      for (int i = 0; i < q; i++) {
          int x = sc.nextInt();
          int y = sc.nextInt();
          ArrayList<Integer> list = lists.get(x-1);
          try{
              System.out.println(list.get(y-1));
          } catch(IndexOutOfBoundsException e) {
              System.out.println("ERROR!");
          }
      }
	}

}
