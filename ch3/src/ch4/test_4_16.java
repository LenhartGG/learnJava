package ch4;

//��̼��� 50+49+48+������+1 ��ֵ���õݹ鷽��ʵ�֡�
public class test_4_16 {
	
	static int add(int n) {
		if(n==1) {
			return 1;
		} else {
			return n+add(n-1);
		}
	}
	
	public static void main(String[] args) {
		int n = 50;
		int f50 = add(n);
		System.out.println(f50);
	}
}
