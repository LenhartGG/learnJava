package java_02_array;

import java.util.ArrayList;

/**
 * @author hliu047
 * Java ʵ�� - ���齻�� 
 * ����ʵ����ʾ�����ʹ�� retainAll () ������������������Ľ����� 
 */
public class ArraysRetainall {
	public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 ��Ԫ��" +objArray);
        System.out.println("array2 ��Ԫ��" +objArray2);
        objArray.retainAll(objArray2);
        System.out.println("array1 �� array2 ���齻��Ϊ��"+objArray);
	}
}
