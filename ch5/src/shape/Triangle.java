package shape;

public class Triangle extends Coordinates implements Shapes{			//由抽象类派生的子类----直角三角形类
	public int width,height;
	public double c;					//斜边
	public double getArea() {return (0.5*width*height);}
	public double getPerimeter() {return (width+height+c);}
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		width=base;
		this.height=height;
		c=Math.sqrt(width*width+height*height);
	}
}