package ch64;

//在矩阵中查找最大数
class Maxvalue{
	/**
	 * @param arr1
	 * @return max
	 */
	int maxvl(int arr1[][]) {
		int i, k, max;
		int len=arr1.length, len1;
		max = arr1[0][0];
		for(i=0; i<=len-1; i++) {
			len1 = arr1[i].length;
			for(k=0; k<len1; k++) {
				if(arr1[i][k] > max) max=arr1[i][k];
			}
		}
		return max;
	}
}

public class C6_12{
	public static void main(String[] args) {
		int maxx;
		int arr[][] = {{12,3,4123}, {123,14,12}, {-2,2,12,5}};
		Maxvalue p1 = new Maxvalue();
		maxx = p1.maxvl(arr);
		System.out.println("max="+maxx);
	}
}