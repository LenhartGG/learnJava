package ch8;

import java.util.ArrayList;

/**
 * E 泛型类型的简单操作
 * @author hliu047
 * @param <E>
 *
 */
public class C8_f2<E> extends ArrayList<E>{
	/**
	 * swap 调换位置
	 * @param i
	 * @param j
	 */
	void swap(int i, int j) {
		E temp = this.get(i);
		this.set(i, this.get(j));
		this.set(j, temp);
	}
	public static void main(String[] args) {
		C8_f2<String> list = new C8_f2<String>();
		list.add("a1");
		list.add("b1");
		System.out.println(list.get(0)+" "+list.get(1));
		list.swap(0, 1);
		System.out.println(list.get(0)+" "+list.get(1));
	}
}
