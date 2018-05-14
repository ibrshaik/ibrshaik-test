 package com.java.ibshaik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" enter the input");
		Scanner sc = new Scanner(System.in);
		
		int testcases = Integer.parseInt(sc.nextLine());
		List<Student> list = new ArrayList<>();
		while(testcases>0){
			
			int id = sc.nextInt();
			String name = sc.next();
			double cgpa = sc.nextDouble();
			Student st = new Student(id,name,cgpa);
			list.add(st);
			testcases--;
		}
		Collections.sort(list);
		for(Student st1 : list){
			 System.out.println(st1.getName());
		}
	}

}

class Student implements Comparable{
	private int id;
	private String name;
	private double cgpa;
	public Student(int id,String name,double cgpa){
		super();
		this.id =id;
		this.name= name;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int compareTo(Object o){
        Student s=(Student)o;
        if(cgpa==s.cgpa){
            if(name.equals(s.name)){
                return id-s.id;
            }else{
                return name.compareTo(s.name);
            }
        }else{
            if(s.cgpa-cgpa>0)
                return 1;
            else 
                return -1;
        }
    }
	
	
}