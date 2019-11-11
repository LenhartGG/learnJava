package ch8;

class Box<T> {
	private T t;
	void g1(T t1)
	{
		t=t1;
	}
	T get() {
		return t;
	}
}
/**
 * T 泛型类型的简单操作
 * @author hliu047
 *
 */
public class C8_f1 {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<Integer>();
		Box<String> strBox = new Box<String>();
		intBox.g1(10);
		strBox.g1("abc");
		Integer someInt = intBox.get();
		String someStr = strBox.get();
		System.out.println(someInt);
		System.out.println(someStr);
	}
}
