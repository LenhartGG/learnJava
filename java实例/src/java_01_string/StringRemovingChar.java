package java_01_string;

/**
 * Java 实例 - 删除字符串中的一个字符
 * @author hliu047
 */
public class StringRemovingChar {
	public static void main(String[] args) {
		String str = "This is Java";
		System.out.println(removeChar(str, 3));
	}
	
	/**删除字符串中的一个字符
	 * @param str
	 * @param pos
	 * @return
	 */
	static String removeChar(String str, int pos) {
		return str.substring(0, pos) + str.substring(pos+1, str.length());
	}
}
