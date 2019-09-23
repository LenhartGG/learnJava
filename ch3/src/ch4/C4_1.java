package ch4;

import java.applet.Applet;
import java.awt.Graphics;

public class C4_1 extends Applet {
	int a=5;
	double b=23.4;
	public void paint(Graphics g) {
		g.drawString("a="+a, 25, 25);
		g.drawString("b="+b, 25, 35);
	}
}
