package ch8;

import java.util.ArrayList;
import java.util.List;

/**
 * 	实现List接口，并进行简单操作
 * @author hliu047
 *
 */
public class C8_2 {
	public static void main(String[] args) {
		//创建ArrayList，并转型为List
		List<String> c1 = new ArrayList<String>();
		c1.add("A1");	c1.add("B2");	c1.add("C3");
		System.out.println("输出集合所有元素"+c1);
		c1.add(1, "f1");
		System.out.println("输出集合所有元素"+c1);
		String b="B2";
		int n = c1.indexOf(b);	//查找制定下标的元素
		System.out.println("输出集合所有元素"+c1);
		c1.remove(n);			//删除指定下标的元素
		System.out.println("输出集合所有元素"+c1);
		System.out.println("输出集合所有元素：");
		for(int i=0; i<c1.size(); i++) {
			System.out.print(c1.get(i)+",");
		}
		
	}
}
