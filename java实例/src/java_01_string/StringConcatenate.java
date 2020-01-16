package java_01_string;

/**
 * @author hliu047
 * Java 实例 - 连接字符串 
 */
public class StringConcatenate {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String strArr[] = new String[5000];
		for (int i=0; i<5000; i++) {
			String result = "This is";
			strArr[i] = String.valueOf(result.hashCode());
		}
		long endTime = System.currentTimeMillis();
        System.out.println("字符串连接" 
        + " - 使用 + 操作符 : " 
        + (endTime - startTime)+ " ms");
        System.out.println(strArr[0]+"\n"+strArr[1]+"\n"+strArr[2]);

		long startTime1 = System.currentTimeMillis();
		String strArr1[] = new String[5000];
		for (int i=0; i<5000; i++) {
			StringBuffer result = new StringBuffer();
			result.append("This is");
			strArr1[i] = String.valueOf(result.hashCode());
		}
		long endTime1 = System.currentTimeMillis();
        System.out.println("字符串连接" 
        + " - 使用 StringBuffer : "
        + (endTime1 - startTime1)+ " ms");
        System.out.println(strArr1[0]+"\n"+strArr1[1]+"\n"+strArr1[2]);
	}
}
