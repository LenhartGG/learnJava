package java_01_string;
import java.util.ArrayList;

/**
 * @author hliu047
 * Java 实例 – 字符串比较
 */
public class StringCompareEmp {
    public static void main(String[] args)  {
    	String str = "Hello World";
    	String anotherString = "hello world";
    	Object objstr = str;
    	
    	System.out.println( str.compareTo(anotherString) );
    	System.out.println( str.compareToIgnoreCase(anotherString) );	//忽略大小写
    	System.out.println( str.compareTo(objstr.toString()) );
    }
}
