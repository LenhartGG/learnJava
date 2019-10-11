package ch64;

/**
 * @author hliu047
 *	两个矩阵相加
 */
class AddClass{
	/**
	 * @param arA
	 * @param arB
	 * @param arC
	 */
	void add(int arA[][], int arB[][], int arC[][]) {
		int i, k, len1;
		int len = arA.length;
		for(i=0; i<len; i++) {
			len1 = arA[i].length;
			for(k=0; k<len1; k++) {
				arC[i][k] = arA[i][k] + arB[i][k];
			}
		}
	}
}

public class C6_13 {
	public static void main(String[] args) {
		int i, k;
		int arA[][] = {{1,3,7,6},{78,0,42,5},{-98,7,10,-1}};
		int arB[][] = {{1,3,7,6},{78,0,42,5},{-98,7,10,-1}};
		int arC[][] = new int[3][4];
		int len = arA.length, len1;
		AddClass p1=new AddClass();
		p1.add(arA, arB, arC);
		System.out.println("\tA\t\tB\t\tC");
		for(i=0; i<len; i++) {
			len1=arA[i].length;
			for(k=0; k<len1; k++) {
				System.out.print(" "+arA[i][k]);	//打印第i行A矩阵
			}
			System.out.print("\t");

			for(k=0; k<len1; k++) {
				System.out.print(" "+arB[i][k]);	//打印第i行B矩阵
			}
			System.out.print("\t");
			
			for(k=0; k<len1; k++) {
				System.out.print(" "+arC[i][k]);	//打印第i行C矩阵
			}
			System.out.print("\n");
		}
	}
}




