package java_02_array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author hliu047
 * Java 实例 - 数组反转 
 * ArrayList和数组
 */
public class ArraysReserse {
	public static void main(String[] args) {
		
		//1.ArrayList 反转
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		System.out.println("ArrayList反转前："+arrayList);
		Collections.reverse(arrayList);
		System.out.println("ArrayList反转后："+arrayList);
		
		//2.java Array [] 反转
		String array[] = {"A","B","C","D","E"};
		System.out.print("数组反转前：");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		array = reserve(array);
		System.out.print("数组反转后：");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	/**
	 * 数组反转 
	 * 数组是不能使用集合的反转方法的，可以自定义方法实现数组反转
	 * @param arr
	 * @return
	 */
	public static String[] reserve(String[] arr) {
		String[] newArr = new String[arr.length];
		for (int i=0; i<arr.length; i++) {
			newArr[i] = arr[arr.length-i-1];
		}
		return newArr;
	}
}
