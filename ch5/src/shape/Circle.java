package shape;

public class Circle extends Coordinates implements Shapes{			//�ɳ���������������----Բ��
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