package ch72;

public class C7_8 {
	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer();
		StringBuffer buf2 = new StringBuffer(10);
		StringBuffer buf3 = new StringBuffer("hello");
		//���ص�ǰ�ַ�������
		int len1 = buf1.length();
		int len2 = buf2.length();
		int len3 = buf3.length();
		//���ص�ǰ����������
		int le1 = buf1.capacity();
		int le2 = buf2.capacity();
		int le3 = buf3.capacity();
		//��buf3�����±�Ϊ3���ַ�
		char ch = buf3.charAt(3);
		//ʹ��StringBuffer��toString()����������StringBuffer����ת����String�������
		System.out.println("buf1="+buf1.toString());
		System.out.println("buf2="+buf2.toString());
		System.out.println("buf3="+buf3.toString());
		System.out.println("len1="+len1+"\tlen2="+len2+"\tlen3="+len3);
		System.out.println("le1="+le1+"\tle2="+le2+"\tle3="+le3);
		System.out.println("ch="+ch);
	}

}
