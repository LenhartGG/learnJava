package ch8;

import java.util.*;

/**
 * 	��Iterator���Map�Ĳ���
 * @author hliu047
 */
public class C8_11{
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("��", "java");
		map.put("����Ա", "lenhart");
		map.put("��˾", "cienet");
		//��Map�ӿ�ת��ΪSet�ӿ�
		Set<Map.Entry<String, String>> allSet = map.entrySet();
		Iterator<Map.Entry<String, String>> iter = allSet.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}
}
