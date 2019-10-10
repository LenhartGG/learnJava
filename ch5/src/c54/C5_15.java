package c54;

class AddClass2{
	public int x=0, y=0, z=0;
	AddClass2(int x){
		this.x=x;
	}
	AddClass2(int x, int y){
		this.x=x;
		this.y=y;
	}
	AddClass2(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public int add() {
		return (x+y+z);
	}
}

/**
 * C5_15
 * @author hliu047
 *	构造方法的继承
 */
public class C5_15 extends AddClass2{
	int a=0, b=0, c=0;
	
	C5_15(int x){				//子类可重载的构造方法1
		super(x);
		a=x+7;
	}
	C5_15(int x, int y){		//子类可重载的构造方法2
		super(x, y);
		a=x+5; b=y+5;
	}
	C5_15(int x, int y, int z){	//子类可重载的构造方法3
		super(x, y, z);
		a=x+4; b=y+4; c=z+4;
	}
	
	public int add() {
		System.out.println("super: x+y+z=" + super.add());
		return (a+b+c);
	}
	
	public static void main(String[] args) {
		C5_15 p1=new C5_15(2,3,4);
		C5_15 p2=new C5_15(10, 20);
		C5_15 p3=new C5_15(5);
		System.out.println("a+b+c="+p1.add());
		System.out.println("a+b+c="+p2.add());
		System.out.println("a+b+c="+p3.add());
	}
}







