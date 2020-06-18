package Java_抽象工厂模式;

/**
 * Java_抽象工厂模式
 * 
 * @author hliu047 抽象工厂模式是另一个创建模式。 抽象工厂模式，也称为工厂的工厂，有一个工厂创建其他工厂。
 *         当使用抽象工厂模式时，我们首先使用超级工厂创建工厂，然后使用创建的工厂创建对象。
 */

//下面的代码展示了如何使用抽象工厂模式。
//
//我们将要创建形状和打印机。对于形状，我们会有圆形，矩形和正方形。对于打印机，我们将有纸张打印机，网络打印机和屏幕打印机。
//
//对于shape，我们将创建Shape界面，如下所示：

interface Shape {
	void draw();
}

//然后我们创建实现Shape接口的具体类。
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

//我们为打印机创建一个接口。
interface Printer {
	void print();
}

//然后我们创建实现Printer接口的具体类。
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

//我们创建一个抽象类来获取打印机和形状对象的工厂。
abstract class AbstractFactory {
	abstract Printer getPrinter(String type);

	abstract Shape getShape(String shape);
}

//我们创建Factory类，根据给定的信息扩展AbstractFactory以生成具体类的对象。
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

//创建一个Factory生成器/生产器类，通过传递Shape或Printer等信息来获取工厂。
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
		//下面的代码展示了如何使用抽象工厂模式。
		
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
