package ch3;


// 求解1-9的和
class C3_12 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for (;;) 				//	for头的三个构件全部省略
		{
			sum += i++;			//	for循环表达式i++写在了循环体内
			if(i > 10) break;	//	布尔表达式写在了循环体中内的if语句中
		}
		System.out.println("sum = " + sum);
	}
}
