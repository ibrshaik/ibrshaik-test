package com.java.ibshaik;
import java.util.Scanner;

public class Gaja {

	public static void main(String[] args) {
		   System.out.println(" enter the passwrod string to validate");
		      Scanner sc = new Scanner(System.in);
		      String passwd = sc.nextLine();
		      String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$#!*&^%]).{8,}";
		      System.out.println(passwd.matches(pattern));
		   }
	}

