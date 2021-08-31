package creational.abstractfactory;

/**
 * Created by tobilobaowolabi on 31/08/2021
 * Author: tobilobaowolabi
 * Date: 31/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class ThreeDShapeFactory extends AbstractFactory {
  @Override
  Shape getShape(ShapeType shapeType) {
	switch (shapeType) {
	  case TRIANGLE:
		return new Triangle();
	  case CIRCLE:
	    return new Circle();
	  default:
		return null;
	}
  }

}
