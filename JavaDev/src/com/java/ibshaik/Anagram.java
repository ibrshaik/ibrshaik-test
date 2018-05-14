package com.java.ibshaik;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter the tow strings for anagrams check");
			
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			String b = sc.next();
			
			char[] chara = a.toLowerCase().toCharArray();
			Arrays.sort(chara);
			
			char[] charb = b.toLowerCase().toCharArray();
			Arrays.sort(charb);
			
			String a1 = new String(chara);
			String b1 = new String(charb);
			
			if(a1.equals(b1)){
				System.out.println("Anagrams");
			}
			else{
				System.out.println("Not Anagrams");
			}
			
			}

}
