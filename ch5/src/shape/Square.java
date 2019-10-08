package shape;

public class Square extends Coordinates implements Shapes{			//由抽象类派生的子类----矩形类
	public int width,height;
	public double getArea() {return (width*height);}
	public double getPerimeter() {return (2*width+2*height);}
	public Square(int x, int y, int width, int height) {
		super(x, y);
		this.width=width;
		this.height=height;
	}
}