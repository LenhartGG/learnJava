package ch6;
//求两组学生的平均成绩
public class C6_7 {

	//求数组的平均数
	static double average(double ascore[]) {
		double aaver=0;
		for(int i=0; i<ascore.length; i++) {
			aaver = aaver + ascore[i];
		}
		aaver = aaver/ascore.length;
		return aaver;
	}
	
	public static void main(String[] args) {
		double aver1, aver2;
		double s1[] = {90, 70, 80, 50, 99, 88};
		double s2[] = {71, 81, 88, 92};
		System.out.println("s1.length="+s1.length);
		aver1=average(s1);
		System.out.println("aver1="+aver1);
		System.out.println("s2.length="+s2.length);
		aver2=average(s2);
		System.out.println("aver2="+aver2);
	}
}
