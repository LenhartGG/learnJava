package java_01_string;

/**
 * @author hliu047
 * Java ʵ�� - �����ַ������һ�γ��ֵ�λ��
 */
public class SearchlastString {
	public static void main(String[] args) {
		String strOrig = "Hello world, hello Java";
		int lastIndex = strOrig.lastIndexOf("Java");
		if(lastIndex == -1) {
			System.out.println("û���ҵ��ַ��� Java");
		} else {
			System.out.println("Java �ַ��������ֵ�λ��"+lastIndex);
		}
	}
}
