package ch6;

//选择法排序

class SelectSort{
	static void sort(int arr[]) {
		int i, j, k, t;
		int len = arr.length;
		for(i=0; i<len-1; i++) {		//外循环开始
			k = i;
			for(j=i+1; j<len; j++) {
				if(arr[j]<arr[k]) {
					k=j;				//内循环用 k 记录最小值 的下标
				}
			}
			if(k>i) {					//外循环实施交换，可减少交换次数
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
		System.out.println("选择法排序的结果：");
		for(int i=0; i<len; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
	}
}




