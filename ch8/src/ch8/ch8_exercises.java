package ch8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ch8_exercises {
	public static void main(String[] args) {
		//8.5��S1��S2�Ľ����벢��
		problem1();
		//8.6��������ֵΪ2�Ľڵ�ĸ���
		problem2();
		//8.8��������������ϲ���һ�����������ϲ���ɺ�ʹԭ�е�����Ϊ��
		problem3();
	}
	static void problem1(){
		Set<Integer> S1 = new HashSet<Integer>();
		Set<Integer> S2 = new HashSet<Integer>();
		Set<Integer> S3 = new HashSet<Integer>();
		Set<Integer> S4 = new HashSet<Integer>();
		S1.add(1);	S1.add(3);	S1.add(5);	S1.add(7);
		S2.add(2);	S2.add(4);	S2.add(7); 	S2.add(5);	S2.add(9);
		S3.addAll(S1);
		S3.addAll(S2);
		System.out.println(S3);
		S1.retainAll(S2);
		System.out.println(S1);
	}
	static void problem2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);	list.add(8);	list.add(1);	list.add(2);	list.add(89);	list.add(2);
		int conut = Collections.frequency(list, 2);
		System.out.println(conut);
	}
	static void problem3() {
		
	}
}


