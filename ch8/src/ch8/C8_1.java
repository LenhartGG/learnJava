package ch8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 	实现Collection接口并进行简单操作
 * @author hliu047
 *
 */
public class C8_1 {
	public static void main(String[] args) {
		Character[] c = {'A','B','C','D','E'};
		System.out.println("输出元素为字符对象的c数组");
		for(int i=0; i<c.length; i++) System.out.print(c[i]+",");
		System.out.println();
		//创建ArrayList，并转型为Collection
		//Arrays.asList(c)表示c数组的元素是ArrayList的元素
		Collection<Character> c1 = new ArrayList<Character>(Arrays.asList(c));
		c1.add((Character)'f');
		System.out.println("输出集合中添加f后的所有元素"+c1);
		c1.remove((Character)'B');
		System.out.println("输出集合中删除B后的所有元素"+c1);
		System.out.print("用迭代器输出集合中删除B后的所有元素");
		Iterator<Character> it = c1.iterator();	//创建一个迭代器对象
		while(it.hasNext()) {
			Character i = it.next();
			System.out.print(i+",");
		}
		System.out.println();
		Object[] cc = c1.toArray();
		System.out.print("输出集合转数组后数组的所有元素：");
		for(int i=0; i<cc.length; i++) {
			System.out.print(cc[i]+",");
		}
		
	}
}
