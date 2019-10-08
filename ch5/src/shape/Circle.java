package shape;

public class Circle extends Coordinates implements Shapes{			//由抽象类派生的子类----圆类
	public int width,height;
	public double r;					//半径
	public double getArea() {return (r*r*Math.PI);}
	public double getPerimeter() {return (2*Math.PI*r);}
	public Circle(int x, int y, int width, int height) {
		super(x, y);
		this.width=width;
		this.height=height;
		r=(double)width/2.0;
	}
}