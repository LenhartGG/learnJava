package ch4;

import java.applet.Applet; 
import java.awt.Graphics;

final class P1 {
	int i = 7;
	int j = 1;
	void f (Graphics g) {
		g.drawString("OK", 20, 50);
	}
}

public class C4_6 extends Applet {
	public void paint(Graphics g) {
		P1 n = new P1();
		n.f(g);
		n.i = 40;	n.j++;
		g.drawString("i="+n.i, 20, 70);
		g.drawString("j="+n.j, 20, 90);
	}
}