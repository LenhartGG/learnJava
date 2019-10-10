package ch6;
import java.io.*;

class FindSearch{
	int binarySearch(int arr[], int searchValue) {
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high && arr[mid]!=searchValue) {
			if(arr[mid]<searchValue) {
				low=mid+1;				//Ҫ�ҵ�������������ĺ�벿����
			} else {
				high=mid-1;				//Ҫ�ҵ��������������ǰ�벿����
			}
			mid=(low+high)/2;
		}
		if(low>high) mid=-1;
		return mid;
	}
}

public class C6_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int i,search,mid;
		String c1;
		int arr[] = {1,2,3,4,5,6,7,8,12};
		System.out.println("��ӡԭʼ����");
		for(i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print("/n");
		System.out.println("������Ҫ���ҵ�����");
		c1=keyin.readLine();
		search=Integer.parseInt(c1);
		FindSearch p1 = new FindSearch();
		mid = p1.binarySearch(arr, search);
		if(mid==-1) System.out.println("û�ҵ���");
		else System.out.println("���������������е�λ���±��ǣ�"+mid);
		
	}
}








