package ch13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JApplet;

/**
 *	  
 * @author hliu047
 *	ͨ�����������߳�ʵ�֡�Java Now������ο�����Ļ�ϳʷ�����Ĳ�ͣ�߶�
 */
public class C13_2 extends JApplet{
	@Override
	public void init() {
		Container cp=getContentPane();	//�õ�������������
		CString pa=new CString();		//����JPanel��Ķ���
		CSquare pa1=new CSquare();		//����JPanel��Ķ���
		pa.setPreferredSize(new Dimension(300, 150));
		pa.setBackground(Color.cyan); 	//����pa����ı�����ɫ
		pa1.setPreferredSize(new Dimension(300, 150));
		pa1.setBackground(Color.cyan);
		//cp �����Ĳ���ΪBorderLayout�����pa��pa1�Ķ���cp������
		cp.add(pa, BorderLayout.NORTH);
		cp.add(pa1, BorderLayout.SOUTH);
		
	}
}
