package ch8;

import java.util.*;

/**
 * 	ʹ��Ĭ�����Դ���ƶ��б��������
 * @author hliu047
 */
public class C8_15{
	public static void main(String[] args) {
		int[] ar = {12,3,123,14,1245,11,55};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<ar.length; i++) {
			list.add(ar[i]);
		}
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}
