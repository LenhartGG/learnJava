package java_01_string;
import java.util.ArrayList;

/**
 * @author hliu047
 * Java ʵ�� �C �ַ����Ƚ�
 */
public class StringCompareEmp {
    public static void main(String[] args)  {
    	String str = "Hello World";
    	String anotherString = "hello world";
    	Object objstr = str;
    	
    	System.out.println( str.compareTo(anotherString) );
    	System.out.println( str.compareToIgnoreCase(anotherString) );	//���Դ�Сд
    	System.out.println( str.compareTo(objstr.toString()) );
    }
}
