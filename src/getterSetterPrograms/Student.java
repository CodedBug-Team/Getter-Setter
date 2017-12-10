package getterSetterPrograms;

import java.util.Scanner;

public class Student {

	private String name;
	private String classes;
 	private String section;
	private int m1,m2,m3,m4;
	
	public String getName(){
		return name;
	}
	public String getClasses(){
		return classes;
	}
	public void setClasses(String a){
		classes = a;
	}
	public String getSection(){
		return section;
	}
	public void setSection(String b){
		section = b;
	}
	public int getM1(){
		return m1;
	}
	public int getM2(){
		return m2;
	}
	public int getM3(){
		return m3;
	}
	public int getM4(){
		return m4;
	}
	public void acceptData(){
	Scanner in = new Scanner(System.in);
	System.out.println("enter name");
	name = in.next();
	System.out.println("enter class:");
	classes = in.next();
	System.out.println("enter section:");
	section = in.next();
	System.out.println("enter marks");
	m1=in.nextInt();
	m2=in.nextInt();
	m3=in.nextInt();
	m4=in.nextInt();
	}
	public void showData(){
	System.out.println("name:"+name);
	System.out.println("class:"+classes);
	System.out.println("section:"+section);
	System.out.println("marks1:"+m1);
	System.out.println("marks2"+m2);
	System.out.println("marks3"+m3);
	System.out.println("marks4"+m4);
	}
	public int getTotal(){
		return(m1+m2+m3+m4);
	}
	public float getPercentage(){
		return((m1+m2+m3+m4)/4);
	}
	public static void main(String args[]){
	Student s = new Student ();
	s.acceptData();
	s.showData();
	System.out.println("total is :"+s.getTotal());
	System.out.println("percentage is:"+s.getPercentage());
	}
}
