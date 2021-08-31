package creational.factory;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/

public class FactoryTest {
  /**
   * This class is used to test our Factory Pattern
   * First we create an object of the ShapeFactory class and then we can call the create shape function to create any shape we like
   * as long as we provide a valid string that matches a shape value as determined in the ShapeFactory class
   */
  public static void main(String[] args) {
	ShapeFactory shapeFactory = new ShapeFactory();
	Shape shape = null; //Our shape is null here because we haven't determined the type of shape the user wants to create yet;

	shape = shapeFactory.createShape("CirCle");
	shape.draw();
	shape.calculateArea();

	shape = shapeFactory.createShape("triANgle");
	shape.draw();
	shape.calculateArea();

	shape = shapeFactory.createShape("SQUARE");
	shape.draw();
	shape.calculateArea();

	shape = shapeFactory.createShape("RECTanglE");
	shape.draw();
	shape.calculateArea();

	/**
	 * As we can see from above, the shape variable can change shapes from circle to rectangle to square to triangle easily because they are
	 * all of type Shape and they all have implementations to draw themselves and compute their area. The implementation is left to the class to provide.
	 * This is also one of the importance of coding to an interface.
	 */
  }
}
