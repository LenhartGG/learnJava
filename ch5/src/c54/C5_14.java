package c54;

/**
 * AddClass
 * @author hliu047
 *	构造方法的重载
 */
class AddClass{
	public int x=0, y=0, z=0;
	// 以下是多个同名不同参数的构造方法
	AddClass(int x){
		this.x=x;
	}
	AddClass(int x, int y){
		this(x);
		this.y=y;
	}
	AddClass(int x, int y, int z){
		this(x, y);
		this.z=z;
	}
	public int add() {
		return (x+y+z);
	}
}

public class C5_14 {
	public static void main(String[] args) {
		AddClass p1=new AddClass(2,3,4);
		AddClass p2=new AddClass(10,20);
		AddClass p3=new AddClass(5);
		System.out.println("x+y+z="+p1.add());
		System.out.println("x+y+z="+p2.add());
		System.out.println("x+y+z="+p3.add());
	}
}
