package java_01_string;

/**
 * @author hliu047
 *	Java 实例 - 字符串查找
 */
public class SearchStringEmp {
	public static void main(String[] args) {
		String strOrig = "Hello world, hello Java";
		int lastIndex = strOrig.indexOf("Java");
		if(lastIndex == -1) {
			System.out.println("没有找到字符串 Java");
		} else {
			System.out.println("Java 字符串出现的位置"+lastIndex);
		}
	}
}
