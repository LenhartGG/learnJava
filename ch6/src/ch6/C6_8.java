package ch6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��ð�����򷨶�8������С�����������

class SortClass{			//�ඨ�忪ʼ
	void sort(int arr[]) {	//��ʼ����ð�����򷽷� sort
		int i,k,temp;
		int len=arr.length;
		for(i=0; i<len-1; i++) {
			for(k=len-1; k>i; k--) {
				if(arr[k]<arr[k-1]) {
					temp=arr[k-1];
					arr[k-1]=arr[k];
					arr[k]=temp;
				}
			}
		}
	}
	
}

public class C6_8 {
	public static void main(String[] args)throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int i;
		String c1;
		int arr[] = new int[8];
		int len = arr.length;
		System.out.println(" ��Ӽ�������8��������һ��ֻ����һ����");
		for(i=0; i<len; i++) {
			c1=keyin.readLine();			//���ڶ�ȡһ���ַ���
			arr[i]=Integer.parseInt(c1);	//���ַ�������c1ת������������
		}
		//��ӡԭʼ����
		System.out.println("ԭʼ���ݣ�");
		for(i=0; i<len; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
		SortClass p1 = new SortClass();
		p1.sort(arr);						//ʵ��Ϊ������
		System.out.println("ð�ݷ�����Ľ����");
		for(i=0; i<len; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
	}
}




