package ch72;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ch7_exercises {
	public static void main(String[] args) {
		String s1 = "F";
		String s2 = "H";
		String s3 = "LenhartGG";
		char s4 = 'F';
		char s5 = 'H';
		char s6 = 'G';
		int aa = 123;
		String text = "Welcome welcome to ADempiere, a commons-based peer-production of Open Source ERP Applications. This Wiki is for the global community to contribute and share know-how and domain expertise. We hope you can find as much open information and participate in making it most usable for everyone. This project has a bazaar of Citizens with a Community Council Team which work in theFunctional Team and Technical Team along the Software Development Procedure supported and funded by the foundation ADempiere";  
		
		System.out.println(s1==s2);
		System.out.println(s1+=s2);
		System.out.println(s1.length());
		
		System.out.println(s1+=s2);
		System.out.println(s4<s5);

		problem3(s3);
		problem4(s3, "G");
		
		problem7();
		problem8();
		System.out.println(integerToString(aa));
		findEnglishNum(text);
		problem15();
	}
	
	/**
	 * 	�ֱ��ַ����еĴ�д�ַ���Сд�ַ����
	 * @param str
	 */
	public static void problem3(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				System.out.print(str.charAt(i));
			}
		}
		
		System.out.println();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}
	
	/**
	 * 	��ӡһ���ַ�����Ҫ���ҵ��ַ����ĳ��ִ���
	 * @param str
	 * @param dest
	 */
	public static void problem4(String str, String dest) {
		int count = 0;
		int index = 0;
		System.out.println(str);

		while((index = str.indexOf(dest))!=-1) {
			str = str.substring(index+dest.length());
			count++;
		}
		System.out.println(dest+": "+count);
	}

	public static void problem7() {
		System.out.println("--------problem7----------");
		
		String ch = "Java Applet";
		System.out.println(ch.length());
		System.out.println(ch.concat("Basic"));
		System.out.println(ch.substring(2, 8));
		System.out.println(ch.replace('a', 'A'));
		System.out.println(ch.replace("a", "A"));
		System.out.println(ch.indexOf("Applet"));
		System.out.println(ch.lastIndexOf("Applet"));
	}
	

	public static void problem8() {
		System.out.println("--------problem8----------");
		StringBuffer ch = new StringBuffer("Java Applet");
		System.out.println(ch.insert(3, 'p'));
		System.out.println(ch.append("Basic"));
		ch.setLength(5);
		System.out.println(ch);
		ch.reverse();
		System.out.println(ch);
	}

	/**
	 * 	������ת��Ϊ�ַ���
	 * @param integer
	 * @return
	 */
	static String integerToString(int integer) {
		String str = "";
		str = String.valueOf(integer);
		return str;
	}
	
	//����һ���ַ�����ͳ���ж��ٸ����ʣ�����֮���ÿո�ָ���
    /** 
 	 *	ͳ�Ƹ������ʳ��ֵĴ��� 
     * @param text 
     */  
    public static void findEnglishNum(String text){  
        //�ҳ����еĵ���  
        String[] array = {".", " ", "?", "!"};  
        for (int i = 0; i < array.length; i++) {  
            text = text.replace(array[i],",");  
        }  
        String[] textArray = text.split(",");  
          
        //���� ��¼  
        Map<String, Integer> map = new HashMap<String, Integer>();  
        for (int i = 0; i < textArray.length; i++) {  
            String key = textArray[i];  
            //תΪСд  
            String key_l = key.toLowerCase();  
            if(!"".equals(key_l)){  
                Integer num = map.get(key_l);  
                if(num == null || num == 0){  
                    map.put(key_l, 1);  
                }else if(num > 0){  
                    map.put(key_l, num+1);  
                }  
            }  
        }  
        //���������̨  
        System.out.println("�������ʳ��ֵ�Ƶ��Ϊ��");  
        Iterator<String> iter = map.keySet().iterator();  
        while(iter.hasNext()){  
            String key = iter.next();  
            Integer num = map.get(key);  
            System.out.println(key + "\n\t\t" + num + "��\n-------------------");  
        }  
    } 
	
    public static void problem15() {
    	String str = "123";
    	StringBuffer tempStringBuffer = new StringBuffer("abc");
    	
    	str = str + "456";
    	tempStringBuffer.append("qwe");
    	
    	System.out.println(str);
    	System.out.println(tempStringBuffer);
    }
}
