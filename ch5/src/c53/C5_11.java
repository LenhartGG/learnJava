package c53;

class AlassArea{
	double x,y;
	double area(double x, double y) {
		double s;
		this.x = x;		// 借助this来表示引用的是类数据成员
		this.y = y;
		s = this.x * this.y;
		return s;
	}
}

public class C5_11 extends AlassArea {
	public static void main(String[] args) {
		double a=2.2, b=3.1, z;
		C5_11 ss = new C5_11();
		z = ss.area(a, b);
		System.out.println("z="+z);
	}
}
