package ch6;

/**
 * 	�������������ʼ�����䳤�ȵĲⶨ
 * @author hliu047
 *
 */
public class C6_1 {
	public static void main(String[] args) {
		int i;
		double a1[];
		char[] a2;
		a1=new double[8];
		a2=new char[8];
		int a3[]=new int[8];
		byte[] a4=new byte[8];
		char a5[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		//����ⶨ������ĳ���
		System.out.println("a1.length="+a1.length);
		System.out.println("a2.length="+a2.length);
		System.out.println("a3.length="+a3.length);
		System.out.println("a4.length="+a4.length);
		System.out.println("a5.length="+a5.length);
		//���������е�ÿһ��Ԫ�أ�Ϊ��Ԫ�ظ�ֵ
		for(i=0;i<8;i++) {
			a1[i]=100+i;
			a3[i]=i;
			a2[i]=(char)(i+97);		//��ʽǿ������ת������������ת�����ַ���
		}
		//�����ӡ������Ԫ��
		System.out.println("\ta1\ta2\ta3\ta4\ta5");
		System.out.println("\tdouble\tchar\tint\tbyte\tchar");
		for(i=0;i<8;i++) {
			System.out.println("\t"+a1[i]+"\t"+a2[i]+"\t"+a3[i]+"\t"+a4[i]+"\t"+a5[i]);
		}
		
	}
}



