package java_02_array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author hliu047
 * Java ʵ�� - ���鷴ת 
 * ArrayList������
 */
public class ArraysReserse {
	public static void main(String[] args) {
		
		//1.ArrayList ��ת
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		System.out.println("ArrayList��תǰ��"+arrayList);
		Collections.reverse(arrayList);
		System.out.println("ArrayList��ת��"+arrayList);
		
		//2.java Array [] ��ת
		String array[] = {"A","B","C","D","E"};
		System.out.print("���鷴תǰ��");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		
		array = reserve(array);
		System.out.print("���鷴ת��");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	/**
	 * ���鷴ת 
	 * �����ǲ���ʹ�ü��ϵķ�ת�����ģ������Զ��巽��ʵ�����鷴ת
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
