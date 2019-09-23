package ch3;

//求解Fibonacci数列的1,1,2,3,5,8···的前36个数。
class C3_11 {
	public static void main(String[] args) {
		int f1=1, f2=1;
		for(int i=1; i<38/2; i++) {
			System.out.print("\t" + f1 + "\t" + f2);	//每次输出两项
			if(i%2==0) System.out.print("\n");			//每输出两次，共4项后换行
			f1 = f1 + f2;		//计算下一个奇位项
			f2 = f2 + f1;		//计算下一个偶位项
		}
		
	}

}
