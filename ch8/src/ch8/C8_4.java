package ch8;

import java.util.LinkedList;

/**
 * 	��LinkedListʵ��һ��ջ��stack���������м򵥲���
 * @author hliu047
 *
 */
public class C8_4 extends LinkedList{
	public static void main(String[] args) {
		//����ArrayList
		C8_4  stack = new C8_4();
		stack.add("a1");
		stack.add("a2");
		stack.add("a3");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack);
	}
}
