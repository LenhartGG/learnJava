package c53;

class Circle{
	double r;
	final double PI = 3.14159265359;
	public Circle(double r) {
		this.r = r;
	}
	double area() { 		//����Բ�����
		return PI * r * r;
	}
	double perimeter() {
		return 2*(this.area()/r);
	}
}

public class C5_12 {
	public static void main(String[] args) {
		double x, y;
		Circle cir = new Circle(5.0);
		x = cir.area();
		y = cir.perimeter();
		System.out.println("Բ�����="+x);
		System.out.println("Բ���ܳ�="+y);
	}
}
