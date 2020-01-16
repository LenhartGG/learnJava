package java_02_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hliu047
 * Java ʵ�� - �������� 
 */
public class ArraysExtension {
	public static void main(String[] args) {
        String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        //ͨ�����鿽�����ﵽ�������ݵ�Ŀ��
        System.arraycopy(names, 0, extended, 0, names.length); 
        for (String str : extended){
            System.out.println(str);
        }
	}
}
