package java_04_methods;

class MyClass{
	int height;
	MyClass(){
		System.out.println("�޲������캯��");
		this.height = 4;
	}
	MyClass(int height){
		this.height = height;
		System.out.println("���Ӹ߶�Ϊ" + this.height + "��");
	}
	
	void info() {
		System.out.println("���Ӹ߶�Ϊ" + this.height + "��");
	}
	void info(String s) {
		System.out.println(s + "���Ӹ߶�Ϊ" + this.height + "��");
	}
}


/**
 * @author hliu047
 * Java ʵ�� �C ��������
 */
public class method_overloading {
	public static void main(String[] args) {
		MyClass t = new MyClass(3);
		t.info();
		t.info("���ط���");
		MyClass t2 = new MyClass();
		t2.info();
	}
}
