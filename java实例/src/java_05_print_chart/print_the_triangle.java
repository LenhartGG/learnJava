package java_05_print_chart;

/**
 * @author hliu047
 * JAVA ´òÓ¡Èý½ÇÐÎ
		     *
		    ***
		   *****
		  *******
		 *********
 */
public abstract class print_the_triangle {
	public static void main(String[] args) {
		printTriangle(5);
	}

	private static void printTriangle(int number) {
		for(int i=1; i<=number; i++)
		{
			for(int j = number-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j <=i; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j <i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
