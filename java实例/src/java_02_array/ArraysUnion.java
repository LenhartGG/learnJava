package java_02_array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hliu047
 * Java ʵ�� - ���鲢�� 
 * ʹ�� union ()������������������Ĳ����� 
 */
public class ArraysUnion {
	public static void main(String[] args) {
        String[] arr1 = { "1", "2", "3" };
        String[] arr2 = { "4", "5", "6" };
        String[] result_union = union(arr1, arr2);
        System.out.println("����������£�");
        
        for (String str: result_union) {
        	System.out.println(str);
        }
	}

	private static String[] union(String[] arr1, String[] arr2) {
		Set<String> set = new HashSet<String>();
		for (String str: arr1) {
			set.add(str);
		}
		for (String str: arr2) {
			set.add(str);
		}
		
		String[] result = {};
		
		return set.toArray(result);
	}
}
