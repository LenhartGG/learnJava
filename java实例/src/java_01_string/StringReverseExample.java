package java_01_string;

/**
 * @author hliu047
 * Java ʵ�� - �ַ�����ת
 */
public class StringReverseExample {
   public static void main(String args[]){
      String string="Hello World";
      String reverse = new StringBuffer(string).reverse().toString();
      System.out.println("�ַ�����תǰ:"+string);
      System.out.println("�ַ�����ת��:"+reverse);
   }
}
