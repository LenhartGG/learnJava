package ch8;

import java.util.LinkedList;

/**
 * 	用LinkedList实现一个栈（stack），并进行简单操作
 * @author hliu047
 *
 */
public class C8_4 extends LinkedList{
	public static void main(String[] args) {
		//创建ArrayList
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
