package java_02_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hliu047
 * Java 实例 - 数组扩容 
 */
public class ArraysExtension {
	public static void main(String[] args) {
        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        //通过数组拷贝来达到数组扩容的目的
        System.arraycopy(names, 0, extended, 0, names.length); 
        for (String str : extended){
            System.out.println(str);
        }
	}
}
