package c55;

import java.applet.Applet;
import java.awt.Graphics;

//��C5_18��Ϊ���м̳������нӿڳ���

interface Shapes{
	abstract double getArea();			//��ͼ������ĳ��󷽷�
	double getPerimeter();		//��ͼ������ĳ��󷽷�
}

class Coordinates{				//����һ���࣬��������н�����ݳ�Աx��y�ģ�����㣩�ĸ�ֵ
	int x,y;
	public Coordinates(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

//����� Square ��̳�Coordinates �ಢʵ�� Shapes �ӿڣ����ֶ��ؼ̳�

class Square extends Coordinates implements Shapes{			//�ɳ���������������----������
	public int width,height;
	public double getArea() {return (width*height);}
	public double getPerimeter() {return (2*width+2*height);}
	public Square(int x, int y, int width, int height) {
		super(x, y);
		this.width=width;
		this.height=height;
	}
}

class Triangle extends Coordinates implements Shapes{			//�ɳ���������������----ֱ����������
	public int width,height;
	public double c;					//б��
	public double getArea() {return (0.5*width*height);}
	public double getPerimeter() {return (width+height+c);}
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		width=base;
		this.height=height;
		c=Math.sqrt(width*width+height*height);
	}
}

class Circle extends Coordinates implements Shapes{			//�ɳ���������������----Բ��
	public int width,height;
	public double r;					//�뾶
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
		g.drawOval(Oval.x, Oval.y, Oval.width, Oval.height);		//��Բ
		g.drawString("oval Area: "+Oval.getArea(), 50, 110);
	}
	
}












