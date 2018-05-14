package com.java.ibshaik;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDup {
    public static void main (String args[]) {
    String input="This this  is text text another another";
   // String originalText = input;
    String output = "";
    Pattern p = Pattern.compile("\\b(\\w+)\\b\\s+\\b\\1\\b", Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(input);
    System.out.println("first input is ==>"+input);
    if (!m.find())
        output = "No duplicates found, no changes made to data";
    else
    {
        while (m.find())
        {
        	System.out.println("entering while");
            if (output == "") {
            	System.out.println("m.group() "+m.group());
                output = input.replaceAll(m.group(), m.group(1));
                System.out.println("second output is ==> "+output);
            } else {
            	System.out.println("else conditionm.group() ==>"+m.group());
                output = output.replaceAll(m.group(), m.group(1));
            }
        }
        input = output;
        System.out.println(" second input is "+input);
        m = p.matcher(input);
        while (m.find())
        {
            output = "";
            if (output == "") {
            	System.out.println("in 2nd while m.group()  ==> "+m.group());
                output = input.replaceAll(m.group(), m.group(1));
            } else {
                output = output.replaceAll(m.group(), m.group(1));
            }
        }
    }
    System.out.println("After removing duplicate the final string is ====" + output);
}
}