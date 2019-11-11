package ch13;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class CSquare extends JPanel implements Runnable
{
	int x1, y1, w1, h1;
	Thread th2=new Thread(this);
	public CSquare() {
		x1=5;	y1=100;	w1=40;	h1=40;
		start();
	}
	public void start() {
		th2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			x1=x1+5;
			if(x1==250) x1=0;
			repaint();
			try {
				Thread.sleep(500); 	//Ê¹Ïß³Ì2Ë¯Ãß500ms
			} catch(Exception e) {	};
		} //while
	} //run
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		Rectangle2D.Double rec1=new Rectangle2D.Double(x1, y1, w1, h1);
		g2.draw(rec1);
	}
	
	
}
