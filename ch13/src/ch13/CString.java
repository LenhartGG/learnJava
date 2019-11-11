package ch13;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class CString extends JPanel implements Runnable {
	int x=10,y=50;
	String Message="Java Now!";
	Font f=new Font("TimesRoman", Font.BOLD, 24);	//创建字体对象
	Thread th1=new Thread(this);
	public CString() {
		start();
	}
	private void start() {
		// TODO Auto-generated method stub
		th1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			x=x-5;
			if(x==0) {
				x=300;
			}
			repaint();		//repaint()方法调用paint()方法重画字符串
			try {
				Thread.sleep(500); 	//使th1线程睡眠500ms
			} catch(Exception e) {
				
			}
		}//while
	}//run
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setFont(f);	//设置字体
		g2.drawString(Message, x, y);
	}
	

}
