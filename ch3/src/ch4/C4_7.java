package ch4;

import java.applet.Applet; 
import java.awt.Graphics;

final class Pc {
	static double ad = 8;
}
//��static���εľ�̬��Ա����
public class C4_7 extends Applet {
	public void paint(Graphics g) {
		Pc m = new Pc();
		Pc m1 = new Pc();
		m.ad = 0.1;	//ֻ��������ݳ�Աad��ֵ
		g.drawString("m1 = "+m1.ad, 20, 50);
		g.drawString("Pc = "+Pc.ad, 20, 70);
		g.drawString("m = "+m.ad, 20, 90);
		
	}
}