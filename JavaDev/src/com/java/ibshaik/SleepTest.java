package com.java.ibshaik;
/*
 * Example of Thread Sleep method in Java
 */
public class SleepTest {
      
       public static void main(String... args){
              System.out.println(Thread.currentThread().getName() + " is going to sleep for 1 Second");
              try {
                     Thread.currentThread().sleep(1000);
                     System.out.println(Thread.currentThread().getName() + " is in sleep state");
              } catch (InterruptedException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }
              System.out.println("Main Thread is woken now");
       }

}

