package java_04_methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hliu047
 * Java 实例 - for 和 foreach循环使用 
 */
public class method_for {
	public static void main(String[] args) {
		int[] intary = {1,2,3,4,5,6,7};
		forDisplay(intary);
		foreachDisplay(intary);
        
		System.out.println("-------- foreach 循环二维数组 ----------");
		//遍历二维数组:
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] row: arr1)
		{
			for(int element: row)
			{
				System.out.print(element+" ");
			}
		}
        System.out.println("");
		
		//以三种方式遍历集合 List
		List<String> list = new ArrayList<String>();
		
        list.add("Google");
        list.add("Runoob");
        list.add("Taobao");
        
        System.out.println("----------方式1：普通for循环-----------");
        for(int i = 0; i < list.size(); i++)
        {
        	System.out.print(list.get(i)+" ");
        }
        System.out.println("");

        System.out.println("----------方式2：使用迭代器-----------");
        for(Iterator<String> iter = list.iterator(); iter.hasNext();)
        {
        	System.out.print(iter.next()+" ");
        }
        System.out.println("");
        
        System.out.println("----------方式3：For-Each 循环-----------");
        for(String str: list) {
        	System.out.print(str+" ");
        }
	}
	
	private static void forDisplay(int[] data){
		System.out.println("使用 for 循环数组：");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	private static void foreachDisplay(int[] data) {
		System.out.println("使用 foreach 循环数组：");
		for (int a: data) {
			System.out.print(a+" ");
		}
		System.out.println();
	}

}
