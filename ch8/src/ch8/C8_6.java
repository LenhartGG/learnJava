package ch8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 	实现Set接口，并进行简单操作
 * @author hliu047
 */
public class C8_6{
	private static void load(Set set) {
		set.add("Cu");	set.add("To");	set.add("Vu");
		set.add("Er");	set.add("Cy");	set.add("Gu");
	}
	private static void dump(Set set) {
		Iterator<Character> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		System.out.println(" set.size()="+set.size());
	}
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		load(set1);
		dump(set1);
	}
}
