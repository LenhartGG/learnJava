package ch6;
import java.io.*;

class FindSearch{
	int binarySearch(int arr[], int searchValue) {
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high && arr[mid]!=searchValue) {
			if(arr[mid]<searchValue) {
				low=mid+1;				//要找的数可能在数组的后半部分中
			} else {
				high=mid-1;				//要找的数可能在数组的前半部分中
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
		System.out.println("打印原始数据");
		for(i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.print("/n");
		System.out.println("请输入要查找的整数");
		c1=keyin.readLine();
		search=Integer.parseInt(c1);
		FindSearch p1 = new FindSearch();
		mid = p1.binarySearch(arr, search);
		if(mid==-1) System.out.println("没找到！");
		else System.out.println("所查整数在数组中的位置下标是："+mid);
		
	}
}








