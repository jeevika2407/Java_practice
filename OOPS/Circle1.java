package oops.practice;

public class Circle1 {
		double radius;
		String color;
		float Area;
		float pi=(float) 3.14;
		public Circle1(double radius) {
			this.radius=radius;
		}
		public Circle1(double radius,String color) {
			this.radius=radius;
			this.color=color;
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius=radius;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color=color;
		}
		public float getArea() {
			return Area=(float)(pi*(radius*radius));
		}
		   @Override
			public String toString() {
				return "circle radius is " +radius+" colour is "+color+" ";
			}
		   
		public static void main(String [] args) {
			Circle1 obj1=new Circle1(4);
			System.out.println(obj1.toString());
			Circle1 obj2=new Circle1(4,"red");
			System.out.println(obj2.toString());
			
			obj1.setRadius(5);
			obj2.setRadius(3);
			
			System.out.println("radius of obj1:"+ obj1.getRadius());
			
			System.out.println("radius of obj2:"+ obj2.getRadius());
			
			System.out.println("area of the circle obj1: "+obj1.getArea());
			System.out.println("area of the circle obj2: "+obj2.getArea());
			
		}
}
