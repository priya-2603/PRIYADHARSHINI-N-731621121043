package zifo.com;

public class Circle {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
		}
public double getradius() {
	return radius;
}
public void setradius(double radius) {
	this.radius=radius;
}
public double calarea() {
	return Math.PI*radius*radius;
}
public double calcircumference() {
	return 2*Math.PI*radius;
}
void display() {
	System.out.println("circle radius:"+radius);
	System.out.println("circle area:"+calarea());
	System.out.println("circle circumference:" + calcircumference());
	}
public static void main(String[] args) {
	Circle cir = new Circle(5.5);
	cir.display();
	cir.setradius(0);
	cir.display();
}
}
