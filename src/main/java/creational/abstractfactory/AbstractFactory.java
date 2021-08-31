package creational.abstractfactory;

/**
 * Created by tobilobaowolabi on 31/08/2021
 * Author: tobilobaowolabi
 * Date: 31/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public abstract class AbstractFactory {
  abstract Shape getShape(ShapeType shapeType);

  public enum ShapeType{
	CIRCLE, TRIANGLE, RECTANGLE, SQUARE
  }
}

