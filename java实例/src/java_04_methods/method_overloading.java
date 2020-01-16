package java_04_methods;

class MyClass{
	int height;
	MyClass(){
		System.out.println("无参数构造函数");
		this.height = 4;
	}
	MyClass(int height){
		this.height = height;
		System.out.println("房子高度为" + this.height + "米");
	}
	
	void info() {
		System.out.println("房子高度为" + this.height + "米");
	}
	void info(String s) {
		System.out.println(s + "房子高度为" + this.height + "米");
	}
}


/**
 * @author hliu047
 * Java 实例 – 方法重载
 */
public class method_overloading {
	public static void main(String[] args) {
		MyClass t = new MyClass(3);
		t.info();
		t.info("重载方法");
		MyClass t2 = new MyClass();
		t2.info();
	}
}
