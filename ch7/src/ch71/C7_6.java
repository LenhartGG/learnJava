package ch71;

class A1{
	int x, y;
	A1(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return ("\tx="+x+"\ty="+y);
	}
}

//将valueOf(对象)成员方法与toString()成员方法联用，返回对象的字符表示
public class C7_6 {
	public static void main(String[] args) {
		A1 p = new A1(2,6);
		String str = String.valueOf(p);
		System.out.println("str="+str);
	}
}
