package java_01_string;

/**
 * @author hliu047
 * Java ʵ�� - �ַ����Ż� 
 */
public class StringOptimization {
	public static void main(String[] args) {
		String variables[] = new String[500000];
		long startTime0 = System.currentTimeMillis();
		for (int i=0; i<500000; i++) {
			variables[i] = "hello";
		}
		long endTime0 = System.currentTimeMillis();
		System.out.println("ֱ��ʹ���ַ�������ʱ�䣺"+(endTime0 - startTime0)+"ms");

		
		String variables1[] = new String[500000];
		long startTime1 = System.currentTimeMillis();
		for (int i=0; i<500000; i++) {
			variables1[i] = new String("hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("ʹ���ַ������󻨷�ʱ�䣺"+(endTime1 - startTime1)+"ms");


		String variables2[] = new String[500000];
		long startTime2 = System.currentTimeMillis();
		for (int i=0; i<500000; i++) {
			variables2[i] = new String("hello");
			variables2[i] = variables2[i].intern();
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println("ʹ���ַ������󻨷�ʱ�䣺"+(endTime2 - startTime2)+"ms");
	}
}
