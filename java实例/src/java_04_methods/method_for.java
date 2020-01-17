package java_04_methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hliu047
 * Java ʵ�� - for �� foreachѭ��ʹ�� 
 */
public class method_for {
	public static void main(String[] args) {
		int[] intary = {1,2,3,4,5,6,7};
		forDisplay(intary);
		foreachDisplay(intary);
        
		System.out.println("-------- foreach ѭ����ά���� ----------");
		//������ά����:
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] row: arr1)
		{
			for(int element: row)
			{
				System.out.print(element+" ");
			}
		}
        System.out.println("");
		
		//�����ַ�ʽ�������� List
		List<String> list = new ArrayList<String>();
		
        list.add("Google");
        list.add("Runoob");
        list.add("Taobao");
        
        System.out.println("----------��ʽ1����ͨforѭ��-----------");
        for(int i = 0; i < list.size(); i++)
        {
        	System.out.print(list.get(i)+" ");
        }
        System.out.println("");

        System.out.println("----------��ʽ2��ʹ�õ�����-----------");
        for(Iterator<String> iter = list.iterator(); iter.hasNext();)
        {
        	System.out.print(iter.next()+" ");
        }
        System.out.println("");
        
        System.out.println("----------��ʽ3��For-Each ѭ��-----------");
        for(String str: list) {
        	System.out.print(str+" ");
        }
	}
	
	private static void forDisplay(int[] data){
		System.out.println("ʹ�� for ѭ�����飺");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	private static void foreachDisplay(int[] data) {
		System.out.println("ʹ�� foreach ѭ�����飺");
		for (int a: data) {
			System.out.print(a+" ");
		}
		System.out.println();
	}

}
