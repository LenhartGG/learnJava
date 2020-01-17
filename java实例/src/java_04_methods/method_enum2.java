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
 * Java 实例 - Enum（枚举）构造函数及方法的使用 
 */
public class method_enum2 {
	public static void main(String[] args) {
		System.out.println("所有汽车的价格：");
		for(Car2 c: Car2.values()) {
			System.out.println(c+" 需要 "+c.getPrice()+" 美元");
		}
	}
}
