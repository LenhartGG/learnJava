package ch6;

//��������� Fibonacci ���е�ǰ20���ʹ�������±���ʽ�����ѧ�ϵĵ�������
public class C6_2 {
	public static void main(String[] args) {
		int i;
		int f[]=new int[20];	//����f���飬���ڴ洢20����������
		f[0]=1; f[1]=1;
		for(i=2; i<20; i++) {
			f[i]=f[i-2]+f[i-1];	//����Ԫ�ص��±�ʹ��ѭ������
		}
		for(i=0; i<20; i++) {
			if(i%5==0)System.out.println("\n");
			System.out.print("\t"+f[i]);
		}
	}
}
