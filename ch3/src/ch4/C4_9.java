package ch4;

import java.applet.Applet; 
import java.awt.Graphics;

//��final���ε��������ݳ�Ա
final class Ca {
	static int n = 20;
	final int nn;
	final int k = 40;
	Ca(){			// Cc��Ĺ��췽��
		nn = ++n;
	}
	
}
//��static���εľ�̬��Ա����
public class C4_9 extends Applet {
	
	public void paint(Graphics g) {
		Ca m1 = new Ca();
		Ca m2 = new Ca();
		g.drawString("m1 = "+m1.nn, 20, 30);
		g.drawString("m1 = "+m1.k, 20, 50);
		g.drawString("m2 = "+m2.nn, 20, 70);
		g.drawString("m2 = "+m2.k, 20, 90);
	}
}