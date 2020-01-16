package java_01_string;

/**
 * @author hliu047
 * Java 实例 - 字符串反转
 */
public class StringReverseExample {
   public static void main(String args[]){
      String string="Hello World";
      String reverse = new StringBuffer(string).reverse().toString();
      System.out.println("字符串反转前:"+string);
      System.out.println("字符串反转后:"+reverse);
   }
}
