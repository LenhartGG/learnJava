package java_01_string;

/**
 * @author hliu047
 * Java 实例 - 查找字符串最后一次出现的位置
 */
public class SearchlastString {
	public static void main(String[] args) {
		String strOrig = "Hello world, hello Java";
		int lastIndex = strOrig.lastIndexOf("Java");
		if(lastIndex == -1) {
			System.out.println("没有找到字符串 Java");
		} else {
			System.out.println("Java 字符串最后出现的位置"+lastIndex);
		}
	}
}
