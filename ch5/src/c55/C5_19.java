package c55;

import java.applet.Applet;
import java.awt.Graphics;

//将C5_18改为既有继承类又有接口程序

interface Shapes{
	abstract double getArea();			//求图形面积的抽象方法
	double getPerimeter();		//求图形面积的抽象方法
}

class Coordinates{				//增加一个类，在这个类中解决数据成员x、y的（坐标点）的赋值
	int x,y;
	public Coordinates(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

//下面的 Square 类继承Coordinates 类并实现 Shapes 接口，体现多重继承

class Square extends Coordinates implements Shapes{			//由抽象类派生的子类----矩形类
	public int width,height;
	public double getArea() {return (width*height);}
	public double getPerimeter() {return (2*width+2*height);}
	public Square(int x, int y, int width, int height) {
		super(x, y);
		this.width=width;
		this.height=height;
	}
}

class Triangle extends Coordinates implements Shapes{			//由抽象类派生的子类----直角三角形类
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

class Circle extends Coordinates implements Shapes{			//由抽象类派生的子类----圆类
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

public class C5_19 extends Applet {
	Square Box = new Square(5, 15, 25, 25);
	Triangle tri = new Triangle(5, 50, 8, 4);
	Circle Oval = new Circle(5, 90, 25, 25);
	
	public void paint(Graphics g) {
		g.drawRect(Box.x, Box.y, Box.width, Box.height);
		g.drawString("Box Area: " + Box.getArea(), 50,35);
		g.drawString("Box Perimeter: " + Box.getPerimeter(), 50,55);
		g.drawString("tri Area: " + tri.getPerimeter(), 50,75);
		g.drawString("tri Perimeter: " + tri.getPerimeter(), 50,95);
		g.drawOval(Oval.x, Oval.y, Oval.width, Oval.height);		//画圆
		g.drawString("oval Area: "+Oval.getArea(), 50, 110);
	}
	
}













