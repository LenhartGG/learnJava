package ch8;

import java.util.ArrayList;
import java.util.List;

/**
 * 	ʵ��List�ӿڣ������м򵥲���
 * @author hliu047
 *
 */
public class C8_2 {
	public static void main(String[] args) {
		//����ArrayList����ת��ΪList
		List<String> c1 = new ArrayList<String>();
		c1.add("A1");	c1.add("B2");	c1.add("C3");
		System.out.println("�����������Ԫ��"+c1);
		c1.add(1, "f1");
		System.out.println("�����������Ԫ��"+c1);
		String b="B2";
		int n = c1.indexOf(b);	//�����ƶ��±��Ԫ��
		System.out.println("�����������Ԫ��"+c1);
		c1.remove(n);			//ɾ��ָ���±��Ԫ��
		System.out.println("�����������Ԫ��"+c1);
		System.out.println("�����������Ԫ�أ�");
		for(int i=0; i<c1.size(); i++) {
			System.out.print(c1.get(i)+",");
		}
		
	}
}
