package ch6;

//向成员方法传递数组元素

class Ff{
	int aa(int x, int y) {
		int z;
		x=x+4;	y=y+2;	z=x*y;
		return z;
	}
}

public class C6_5 {
	public static void main(String[] args) {
		int arr[] = {6,8,9};
		int len=arr.length, k;
		Ff p1 = new Ff();
		k = p1.aa(arr[0], arr[1]);
		System.out.println("k="+k);
		for(int i=0; i<len; i++) {
			System.out.print(" "+ arr[i]);
		}
		System.out.print("\n");
	}
}
