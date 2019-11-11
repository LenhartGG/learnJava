package ch8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ch8_exercises {
	public static void main(String[] args) {
		//8.5求S1与S2的交集与并集
		problem1();
		//8.6查找属性值为2的节点的个数
		problem2();
		//8.8将两个无序单链表合并成一个有序单链表，合并完成后，使原有单链表为空
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


