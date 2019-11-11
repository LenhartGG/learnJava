package ch8;

import java.util.*;

/**
 * 	实现Map的添加元素和读取元素操作
 * @author hliu047
 */
public class C8_10{
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("书", "java");
		map.put("程序员", "lenhart");
		map.put("公司", "cienet");
		System.out.println("map="+map.toString());
		if(map.containsKey("书")) {
			System.out.print("查找 Key=书 存在	");
			String val = map.get("书");
			System.out.println("书="+val);
		} else {
			System.out.print("查找 Key=书 不存在	");
		}
		
		//全部输出Key
		Set<String> keys = map.keySet();
		Iterator<String> iter1 = keys.iterator();
		System.out.print("全部的Key：");
		while(iter1.hasNext()) {
			String str = iter1.next();
			System.out.print(str+"、");
		}

		//全部输出value
		Collection<String> values = map.values();
		Iterator<String> iter2 = values.iterator();
		System.out.print("\n全部的Value：");
		while(iter2.hasNext()) {
			String str = iter2.next();
			System.out.print(str+"、");
		}
		
		
	}
}
