package ch8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 	ʵ��Collection�ӿڲ����м򵥲���
 * @author hliu047
 *
 */
public class C8_1 {
	public static void main(String[] args) {
		Character[] c = {'A','B','C','D','E'};
		System.out.println("���Ԫ��Ϊ�ַ������c����");
		for(int i=0; i<c.length; i++) System.out.print(c[i]+",");
		System.out.println();
		//����ArrayList����ת��ΪCollection
		//Arrays.asList(c)��ʾc�����Ԫ����ArrayList��Ԫ��
		Collection<Character> c1 = new ArrayList<Character>(Arrays.asList(c));
		c1.add((Character)'f');
		System.out.println("������������f�������Ԫ��"+c1);
		c1.remove((Character)'B');
		System.out.println("���������ɾ��B�������Ԫ��"+c1);
		System.out.print("�õ��������������ɾ��B�������Ԫ��");
		Iterator<Character> it = c1.iterator();	//����һ������������
		while(it.hasNext()) {
			Character i = it.next();
			System.out.print(i+",");
		}
		System.out.println();
		Object[] cc = c1.toArray();
		System.out.print("�������ת��������������Ԫ�أ�");
		for(int i=0; i<cc.length; i++) {
			System.out.print(cc[i]+",");
		}
		
	}
}
