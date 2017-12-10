package getterSetterPrograms;

import java.util.Scanner;

public class Circle extends Point {

protected float radius;
	
	public Circle() {
		super(10,10);
		radius = 10f;
	}
	public Circle (int x,int y) {
 		super (x,y);
		radius = 10f;
	}
	
	public Circle(float radius) {
		super(10,10);
		this.radius = radius ;
	}
	
	public Circle(int x,int y,float radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public Circle(Point p) {
		super (p.getX(),p.getY());
		radius = 10f;
	}
	
	public Circle(Point p,float radius) {
		super (p.getX(),p.getY());
		this.radius = radius;
	}
	
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override		
	public void acceptData() {
 		super.acceptData();
		Scanner in = new Scanner (System.in);
		System.out.println("enter radius:");
		radius = in.nextFloat();
	}

	@Override		
	public void showData() {
		super.showData();
		System.out.println("radius:"+radius);
	}
	public float getArea() {
		return  (float) (Math.PI * Math.pow(radius,2));
	}
	public float getCircumference() {
		return (float) (2 * Math.PI * radius);
	}
	
	public static void main(String args[]) {
		Circle c1 = new Circle();
		c1.showData();
		Circle c2 = new Circle(new Point (1,2),3f);
		c2.showData();
		}
}
