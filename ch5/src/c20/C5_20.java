package c20;
import java.applet.Applet;
import java.awt.Graphics;
import shape.Circle;
import shape.Square;
import shape.Triangle;

public class C5_20 extends Applet {
	Square Box = new Square(5, 15, 25, 25);
	Triangle tri = new Triangle(5, 50, 8, 4);
	Circle Oval = new Circle(5, 90, 25, 25);
	
	public void paint(Graphics g) {
		g.drawRect(Box.x, Box.y, Box.width, Box.height);
		g.drawString("Box Area: " + Box.getArea(), 50,35);
		g.drawString("Box Perimeter: " + Box.getPerimeter(), 50,55);
		g.drawString("tri Area: " + tri.getPerimeter(), 50,75);
		g.drawString("tri Perimeter: " + tri.getPerimeter(), 50,95);
		g.drawOval(Oval.x, Oval.y, Oval.width, Oval.height);		//»­Ô²
		g.drawString("oval Area: "+Oval.getArea(), 50, 110);
	}
}
