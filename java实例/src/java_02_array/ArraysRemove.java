package java_02_array;

import java.util.ArrayList;

/**
 * @author hliu047
 * Java ʵ�� - ɾ������Ԫ�� 
 */
public class ArraysRemove {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.clear();
		objArray.add(0, "�� 0 ��Ԫ��");
		objArray.add(1, "�� 1 ��Ԫ��");
		objArray.add(2, "�� 2 ��Ԫ��");
		objArray.add(3, "�� 3 ��Ԫ��");
		System.out.println("����ɾ��Ԫ��ǰ"+objArray);
		objArray.remove(1);
		objArray.remove("�� 0 ��Ԫ��");
		System.out.println("����ɾ��Ԫ�غ�"+objArray);
		
	}
}
