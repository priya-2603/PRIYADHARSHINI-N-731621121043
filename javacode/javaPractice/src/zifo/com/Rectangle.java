package zifo.com;

public class Rectangle {
	double width;
	double height;
	public Rectangle (double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double getwidth() {
		return width;
	}
	public void setwidth(double width) {
		this.width=width;
	}
	public double getheight() {
		return height;
	}
	public void getheight(double height) {
		this.height=height;
	}
	public double calarea() {
		return width*height;
	}
	public double calperimeter() {
		return 2*(width+height);
	}
	void display() {
		System.out.println("Rectanglewidth:"+width);
		System.out.println("Rectangleheight:"+height);
		System.out.println("Rectanglearea:"+calarea());
		System.out.println("Rectangleperimeter:"+calperimeter());
		}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2.4,4.8);
		rec.display();
	}
	

}
