package java_04_methods;

enum Car2 {
	lamborghini(900),tata(2),audi(100),fiat(199),honda(120);
	private int price;
	Car2(int p){
		price = p;
	}
	int getPrice() {
		return price;
	}
}
/**
 * @author hliu047
 * Java ʵ�� - Enum��ö�٣����캯����������ʹ�� 
 */
public class method_enum2 {
	public static void main(String[] args) {
		System.out.println("���������ļ۸�");
		for(Car2 c: Car2.values()) {
			System.out.println(c+" ��Ҫ "+c.getPrice()+" ��Ԫ");
		}
	}
}
