package ch4;

import java.applet.Applet; 
import java.awt.Graphics;

final class Pc {
	static double ad = 8;
}
//用static修饰的静态成员数据
public class C4_7 extends Applet {
	public void paint(Graphics g) {
		Pc m = new Pc();
		Pc m1 = new Pc();
		m.ad = 0.1;	//只对类的数据成员ad赋值
		g.drawString("m1 = "+m1.ad, 20, 50);
		g.drawString("Pc = "+Pc.ad, 20, 70);
		g.drawString("m = "+m.ad, 20, 90);
		
	}
}