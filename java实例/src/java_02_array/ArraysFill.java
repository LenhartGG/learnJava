package java_02_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hliu047
 * Java ÊµÀı - Êı×éÌî³ä 
 */
public class ArraysFill {
	public static void main(String[] args) {
		int array[] = new int[6];
		Arrays.fill(array, 100);
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		Arrays.fill(array, 3, 6, 50);
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
