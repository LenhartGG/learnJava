package ch6;

//ѡ������

class SelectSort{
	static void sort(int arr[]) {
		int i, j, k, t;
		int len = arr.length;
		for(i=0; i<len-1; i++) {		//��ѭ����ʼ
			k = i;
			for(j=i+1; j<len; j++) {
				if(arr[j]<arr[k]) {
					k=j;				//��ѭ���� k ��¼��Сֵ ���±�
				}
			}
			if(k>i) {					//��ѭ��ʵʩ�������ɼ��ٽ�������
				t=arr[i];
				arr[i]=arr[k];
				arr[k]=t;
			}
		}
	}
}

public class C6_9 {
	public static void main(String[] args) {
		
		int arr[] = {55, 88, 28, 66, 51, 9, 20}; 
		int len = arr.length;
		SelectSort.sort(arr);
		System.out.println("ѡ������Ľ����");
		for(int i=0; i<len; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
	}
}




