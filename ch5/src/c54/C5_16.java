package c54;

import java.applet.Applet;
import java.awt.Graphics;

class Student1{
	public String Name;
	public int age;
	public int score=0;
	public void showStudent(Graphics g, int x, int y) {
		g.drawString("Name:"+Name, x, y);
		g.drawString("age:"+age, x, y+20);
		g.drawString("score:"+score, x, y+40);
	}
}

/**
 * C5_16
 * @author hliu047
 *	向方法传递对象
 */
public class C5_16 extends Applet {
	public void studentAttributes(Student1 s, String Name, int age, int score) {
		s.Name=Name;
		s.age=age;
		s.score=score;
	}
	public void paint(Graphics g) {
		Student1 st1=new Student1();
		Student1 st2=new Student1();
		studentAttributes(st1, "zhangsan", 22, 90);
		studentAttributes(st2, "lisi", 23, 81);
		st1.showStudent(g, 20, 20);
		st2.showStudent(g, 20, 120);
	}
}
