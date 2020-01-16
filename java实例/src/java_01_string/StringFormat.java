package java_01_string;

import java.util.Locale;

/**
 * @author hliu047
 * Java 实例 - 字符串格式化 
 */
public class StringFormat {
	public static void main(String[] args) {
		double e = Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.CHINA, "%-10.4f%n%n", e);  //指定本地为中国（CHINA）
	}
}
