package java_01_string;

/**
 * @author hliu047
 * Java ʵ�� - �ַ����滻
 */
public class StringReplaceEmp {
   public static void main(String args[]){
      String str="Hello World";
      System.out.println( str.replace( 'H','W' ) );
      System.out.println( str.replaceFirst("He", "Wa") );
      System.out.println( str.replaceAll("He", "Ha") );
   }
}
