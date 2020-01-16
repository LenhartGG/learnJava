package java_02_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hliu047
 * Java 实例 - 数组合并 
 */
public class ArraysMerge {
	public static void main(String[] args) {
		String a[] = {"a", "e", "i"};
		String b[] = {"o", "u"};
		List list = new ArrayList(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}
}
