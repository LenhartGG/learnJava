package ch3;

//编写求解(1!+2!+3!+···+7!+8!)的程序
public class C3_17 {
	public static void main(String[] args) {
		int n=1,m,s,k=0;
		while(n<=8) {
			for(s=1, m=1; m<=n; m++) {
				s = s*m;		//计算n!，结果保存于s中
			}
			k = k+s;			//计算前n项阶乘之和，结果存于k中
			System.out.println(n + "!=" + s + "     k=" + k);
			n++;
		}
	}
}
