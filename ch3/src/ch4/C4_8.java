package ch4;

import java.applet.Applet; 
import java.awt.Graphics;

final class Cc {
	static int n;
	int nn;
	static {		// ��̬��ʼ����
		n = 20;		// ��ʼ���۵ľ�̬���ݳ�Ա n
	}
	Cc(){			// Cc��Ĺ��췽��
		nn = n++;
	}
	
}
//��static���εľ�̬��Ա����
public class C4_8 extends Applet {
	
	public void paint(Graphics g) {
		Cc m = new Cc();
		Cc m1 = new Cc();
		g.drawString("m1 = "+m1.nn, 20, 50);
		g.drawString("m = "+m.nn, 20, 90);
		
	}
}