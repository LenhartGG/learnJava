package ch13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JApplet;

/**
 *	  
 * @author hliu047
 *	通过创建两个线程实现“Java Now”与矩形框在屏幕上呈反方向的不停走动
 */
public class C13_2 extends JApplet{
	@Override
	public void init() {
		Container cp=getContentPane();	//得到窗口容器对象
		CString pa=new CString();		//创建JPanel类的对象
		CSquare pa1=new CSquare();		//创建JPanel类的对象
		pa.setPreferredSize(new Dimension(300, 150));
		pa.setBackground(Color.cyan); 	//设置pa对象的背景颜色
		pa1.setPreferredSize(new Dimension(300, 150));
		pa1.setBackground(Color.cyan);
		//cp 容器的布局为BorderLayout，添加pa及pa1的对象到cp容器中
		cp.add(pa, BorderLayout.NORTH);
		cp.add(pa1, BorderLayout.SOUTH);
		
	}
}
