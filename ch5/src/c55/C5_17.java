//package c55;
//
//import java.applet.Applet;
//import java.awt.Graphics;
//
//abstract class Shapes{					//定义一个抽象类 Shapes
//	public int x,y;						//x、y为画图的坐标
//	public int width,height;
//	public Shapes(int x, int y, int width, int height) {
//		this.x=x;
//		this.y=y;
//		this.width=width;
//		this.height=height;
//	}
//	abstract double getArea();			//求图形面积的抽象方法
//	abstract double getPerimeter();		//求图形面积的抽象方法
//}
//
//class Square extends Shapes{			//由抽象类派生的子类----矩形类
//	public double getArea() {return (width*height);}
//	public double getPerimeter() {return (2*width+2*height);}
//	public Square(int x, int y, int width, int height) {
//		super(x, y, width, height);
//	}
//}
//
//class Triangle extends Shapes{			//由抽象类派生的子类----直角三角形类
//	public double c;					//斜边
//	public double getArea() {return (0.5*width*height);}
//	public double getPerimeter() {return (width+height+c);}
//	public Triangle(int x, int y, int base, int height) {
//		super(x, y, base, height);
//		c=Math.sqrt(width*width+height*height);
//	}
//}
//
//class Circle extends Shapes{			//由抽象类派生的子类----圆类
//	public double r;					//半径
//	public double getArea() {return (r*r*Math.PI);}
//	public double getPerimeter() {return (2*Math.PI*r);}
//	public Circle(int x, int y, int width, int height) {
//		super(x, y, width, height);
//		r=(double)width/2.0;
//	}
//}
//
//public class C5_17 extends Applet {
//	Square Box = new Square(5, 15, 25, 25);
//	Triangle tri = new Triangle(5, 50, 8, 4);
//	Circle Oval = new Circle(5, 90, 25, 25);
//	
//	public void paint(Graphics g) {
//		g.drawRect(Box.x, Box.y, Box.width, Box.height);
//		g.drawString("Box Area: " + Box.getArea(), 50,35);
//		g.drawString("Box Perimeter: " + Box.getPerimeter(), 50,55);
//		g.drawString("tri Area: " + tri.getPerimeter(), 50,75);
//		g.drawString("tri Perimeter: " + tri.getPerimeter(), 50,95);
//		g.drawOval(Oval.x, Oval.y, Oval.width, Oval.height);		//画圆
//		g.drawString("oval Area: "+Oval.getArea(), 50, 110);
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
