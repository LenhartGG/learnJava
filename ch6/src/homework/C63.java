package homework;

class MaxMin{
	int maxval(int arr1[]) {
		int i;
		int max = arr1[0];
		int len=arr1.length;
		for(i=0; i<len; i++) {
			if(max<arr1[i]) max=arr1[i];
		}
		return max;
	}

	int minval(int arr1[]) {
		int i;
		int max = arr1[0];
		int len=arr1.length;
		for(i=0; i<len; i++) {
			if(max>arr1[i]) max=arr1[i];
		}
		return max;
	}
}

public class C63 {
	public static void main(String[] args) {
		
	}
}
