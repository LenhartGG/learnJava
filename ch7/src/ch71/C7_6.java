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

//��valueOf(����)��Ա������toString()��Ա�������ã����ض�����ַ���ʾ
public class C7_6 {
	public static void main(String[] args) {
		A1 p = new A1(2,6);
		String str = String.valueOf(p);
		System.out.println("str="+str);
	}
}
