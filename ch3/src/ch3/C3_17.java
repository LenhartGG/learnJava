package ch3;

//��д���(1!+2!+3!+������+7!+8!)�ĳ���
public class C3_17 {
	public static void main(String[] args) {
		int n=1,m,s,k=0;
		while(n<=8) {
			for(s=1, m=1; m<=n; m++) {
				s = s*m;		//����n!�����������s��
			}
			k = k+s;			//����ǰn��׳�֮�ͣ��������k��
			System.out.println(n + "!=" + s + "     k=" + k);
			n++;
		}
	}
}
