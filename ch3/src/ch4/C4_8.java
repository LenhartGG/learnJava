package ch4;

import java.applet.Applet; 
import java.awt.Graphics;

final class Cc {
	static int n;
	int nn;
	static {		// 静态初始化器
		n = 20;		// 初始化累的静态数据成员 n
	}
	Cc(){			// Cc类的构造方法
		nn = n++;
	}
	
}
//用static修饰的静态成员数据
public class C4_8 extends Applet {
	
	public void paint(Graphics g) {
		Cc m = new Cc();
		Cc m1 = new Cc();
		g.drawString("m1 = "+m1.nn, 20, 50);
		g.drawString("m = "+m.nn, 20, 90);
		
	}
}