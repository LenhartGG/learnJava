package java_05_print_chart;

/**
 * @author hliu047
 * Java ÊµÀý ¨C ¾Å¾Å³Ë·¨±í
 */
public class java_print_MultiplicationTable {
	public static void main(String[] args) {
		for(int i = 1; i<=9; i++)
		{
			for(int j=i; j<=9; j++)
			{
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
