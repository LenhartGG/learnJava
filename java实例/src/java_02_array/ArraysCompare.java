package java_02_array;

/**
 * @author hliu047
 * Java ʵ�� - ���������е��ظ�Ԫ�� 
 */
public class ArraysCompare {
	public static void main(String[] args) {
		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
		findDuplicateInArray(my_array);
	}

	private static void findDuplicateInArray(int[] array) {
		int count = 0;
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println( "�ظ�Ԫ�� : " +  array[i] );
			}
			count=0;
		}
	}
}
