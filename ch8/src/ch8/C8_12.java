package ch8;

import java.util.*;

/**
 * 	用TreeMap进行简单操作。
 * @author hliu047
 */
public class C8_12{
	public static void main(String[] args) {
		SortedMap<String,String> smap = new TreeMap<String, String>();
		smap.put("A", "01");
		smap.put("C", "03");
		smap.put("D", "04");
		smap.put("B", "02");
		System.out.println("sortMap="+smap);
		System.out.println("headMap('C')="+smap.headMap("C"));
		System.out.println("subMap('B','D')="+smap.subMap("B", "D"));
		System.out.println("first()="+smap.firstKey());
		System.out.println("last()="+smap.lastKey());
	}
}
