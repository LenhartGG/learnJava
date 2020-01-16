package java_02_array;

import java.util.ArrayList;

/**
 * @author hliu047
 * Java 实例 - 在数组中查找指定元素 
 */
public class ArraysFind {
	public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        System.out.println("objArray 的数组元素："+objArray);
        System.out.println("objArray2 的数组元素："+objArray2);
        System.out.println("objArray 是否包含字符串 common2 ？ "+objArray.contains("common2"));
        System.out.println("objArray2 是否包含字符串 objArray ？ "+objArray.contains(objArray));
	}
}
