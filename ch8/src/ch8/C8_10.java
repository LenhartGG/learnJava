package ch8;

import java.util.*;

/**
 * 	ʵ��Map�����Ԫ�غͶ�ȡԪ�ز���
 * @author hliu047
 */
public class C8_10{
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("��", "java");
		map.put("����Ա", "lenhart");
		map.put("��˾", "cienet");
		System.out.println("map="+map.toString());
		if(map.containsKey("��")) {
			System.out.print("���� Key=�� ����	");
			String val = map.get("��");
			System.out.println("��="+val);
		} else {
			System.out.print("���� Key=�� ������	");
		}
		
		//ȫ�����Key
		Set<String> keys = map.keySet();
		Iterator<String> iter1 = keys.iterator();
		System.out.print("ȫ����Key��");
		while(iter1.hasNext()) {
			String str = iter1.next();
			System.out.print(str+"��");
		}

		//ȫ�����value
		Collection<String> values = map.values();
		Iterator<String> iter2 = values.iterator();
		System.out.print("\nȫ����Value��");
		while(iter2.hasNext()) {
			String str = iter2.next();
			System.out.print(str+"��");
		}
		
		
	}
}
