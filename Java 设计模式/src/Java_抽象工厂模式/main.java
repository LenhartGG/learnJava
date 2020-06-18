package Java_���󹤳�ģʽ;

/**
 * Java_���󹤳�ģʽ
 * 
 * @author hliu047 ���󹤳�ģʽ����һ������ģʽ�� ���󹤳�ģʽ��Ҳ��Ϊ�����Ĺ�������һ��������������������
 *         ��ʹ�ó��󹤳�ģʽʱ����������ʹ�ó�����������������Ȼ��ʹ�ô����Ĺ�����������
 */

//����Ĵ���չʾ�����ʹ�ó��󹤳�ģʽ��
//
//���ǽ�Ҫ������״�ʹ�ӡ����������״�����ǻ���Բ�Σ����κ������Ρ����ڴ�ӡ�������ǽ���ֽ�Ŵ�ӡ���������ӡ������Ļ��ӡ����
//
//����shape�����ǽ�����Shape���棬������ʾ��

interface Shape {
	void draw();
}

//Ȼ�����Ǵ���ʵ��Shape�ӿڵľ����ࡣ
class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}

//����Ϊ��ӡ������һ���ӿڡ�
interface Printer {
	void print();
}

//Ȼ�����Ǵ���ʵ��Printer�ӿڵľ����ࡣ
class PaperPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("paper");
	}
}

class WebPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("web");
	}
}

class ScreenPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("screen");
	}
}

//���Ǵ���һ������������ȡ��ӡ������״����Ĺ�����
abstract class AbstractFactory {
	abstract Printer getPrinter(String type);

	abstract Shape getShape(String shape);
}

//���Ǵ���Factory�࣬���ݸ�������Ϣ��չAbstractFactory�����ɾ�����Ķ���
class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	Printer getPrinter(String type) {
		return null;
	}
}

class PrinterFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Printer getPrinter(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("paper")) {
			return new PaperPrinter();
		} else if (type.equalsIgnoreCase("web")) {
			return new WebPrinter();
		} else if (type.equalsIgnoreCase("Screen")) {
			return new ScreenPrinter();
		}
		return null;
	}
}

//����һ��Factory������/�������࣬ͨ������Shape��Printer����Ϣ����ȡ������
class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("Printer")) {
			return new PrinterFactory();
		}
		return null;
	}
}

public class main {

	public static void main(String[] args) {
		//����Ĵ���չʾ�����ʹ�ó��󹤳�ģʽ��
		
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		shape1.draw();	// call draw method of Shape Circle
		Shape shape2 = shapeFactory.getShape("RECTANGLE");	// get an object of Shape Rectangle
		shape2.draw();	// call draw method of Shape Rectangle
		Shape shape3 = shapeFactory.getShape("SQUARE");	// get an object of Shape Square
		shape3.draw();	// call draw method of Shape Square
		
		
		// get printer factory
		AbstractFactory printerFactory = FactoryProducer.getFactory("printer");

		Printer printer1 = printerFactory.getPrinter("Paper");
		printer1.print();
		Printer printer2 = printerFactory.getPrinter("Web");
		printer2.print();
		Printer printer3 = printerFactory.getPrinter("Screen");
		printer3.print();

	}

}
