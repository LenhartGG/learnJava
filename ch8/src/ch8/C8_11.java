package ch8;

import java.util.*;

/**
 * 	用Iterator输出Map的操作
 * @author hliu047
 */
public class C8_11{
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("书", "java");
		map.put("程序员", "lenhart");
		map.put("公司", "cienet");
		//将Map接口转换为Set接口
		Set<Map.Entry<String, String>> allSet = map.entrySet();
		Iterator<Map.Entry<String, String>> iter = allSet.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> me = iter.next();
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}
}
