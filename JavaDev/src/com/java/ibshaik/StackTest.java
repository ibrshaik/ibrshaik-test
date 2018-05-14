package com.java.ibshaik;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" enter the input");
		/*Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
	    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
	    System.out.println(input.isEmpty());*/
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
		     String input=sc.next();
		     Stack<Character> stacky = new Stack<>();
		     for (int i = 0; i < input.length(); i++) {
		        if (!stacky.isEmpty()) {
		            switch(input.charAt(i)) {
		                case '}' : if (stacky.peek() == '{') {
		                    stacky.pop();
		                } break;
		                case ']' : if (stacky.peek() == '[') {
		                    stacky.pop();
		                } break;
		                case ')' : if (stacky.peek() == '(') {
		                    stacky.pop();
		                } break;
		                default: stacky.push(input.charAt(i));
		          }
		        } else {
		            stacky.push(input.charAt(i));
		        } 
		     }
		     System.out.println(stacky.isEmpty());
		  }

		
		
		
	}

}
