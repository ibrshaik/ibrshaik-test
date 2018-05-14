package com.java.ibshaik;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter the length of the array");
			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			int[] arr = new int[length];
			int sum = Integer.MIN_VALUE;
			System.out.println("aray length is "+arr.length);
			for(int i = 0;i<length;i++){
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<=length;i++){
				//System.out.println(arr[i]);
				System.out.println(" ");
				for(int j=i;j>=i;j--){
					System.out.print(arr[j]);
					//System.out.println(" ");
					
				}
			}
	}

}
