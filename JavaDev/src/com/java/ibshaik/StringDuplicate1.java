package com.java.ibshaik;

import java.util.Scanner;

public class StringDuplicate1{

	public static void main(String[] args) {
		
		System.out.println("enter the string to remove the duplicates");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] words = str.split("\\s");
		
		for(int i=0;i<words.length;i++){
			for(int j=0;j<words.length;j++){
				if(words[i].equals(words[j])){
					if(i != j){
						words[j] = "";
					}
				}
			}
		}
		for(int k=0;k<words.length;k++){
			if(words[k] != "" ){
				System.out.print(words[k]+" ");
			}
		}
		
	}


}