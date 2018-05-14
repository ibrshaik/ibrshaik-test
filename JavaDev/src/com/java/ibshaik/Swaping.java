package com.java.ibshaik;

import java.io.*;

class Swaping
{
     public static void main(String args[]) 
     {
         String name="Abc$123";
         System.out.println("given string is     "+name);
         int len=name.length();
         char[] c = name.toCharArray();
         for(int i=0;i<len-1;i=i+2)
         {
             char temp= c[i];
             c[i]=c[i+1];
             c[i+1]=temp;
         }
    String swap = new String(c);
         System.out.println(swap);
    

    }
}



