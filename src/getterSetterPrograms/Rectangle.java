package getterSetterPrograms;

import java.util.Scanner;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(){
	}
	
	public Rectangle(int width,int height){
		this.width = width;
		this.height = height;
	}
	public int getWidth(){
		return width;
	}
	public void setWidth(int a){
		width=a;
	} 
	public int getHeight(){
		return height;
	}
	public void setHeight(int a){
		height=a;
	} 
	public void acceptData(){
	Scanner in = new Scanner(System.in);
	System.out.print("enter width:");
	width = in.nextInt();
	System.out.print("enter height:");
	height = in.nextInt();
	}
	public void showData(){
		System.out.print("width:"+width);
		System.out.print("height:"+height);
	}
	public int getArea(){
		return (width*height);
	}
	public int getPerimeter(){
		return (2*(width+height));
	}
	public static void main(String args[]){
	Rectangle r = new Rectangle();
	Rectangle r1 = new Rectangle(15,20);
	r.acceptData();
	r.showData();
	System.out.print("Area:"+r.getArea());
	}

}
