package creational.factory;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class ShapeFactory {
  /**
   * This is the actual class responsible for the creation of the desired and correct shape based on the input received.
   * the input varies depending on what the developer chooses. I have decided to just determine the object to instantiate based on just a string.
   */

  public Shape createShape(String shapeName) {
	/**
	 * We could use an "if" statement here but because of how simple this example is, I am using a switch.
	 * We should also make sure that our input is not too rigid. "Circle" and "circle" and even "CircLE" should be able to create a Circle object.
	 */
	String shapeNameToLower = shapeName.toLowerCase();
	switch (shapeNameToLower) {
	  case "triangle":
		return new Triangle();
	  case "circle":
		return new Circle();
	  case "square":
		return new Square();
	  case "rectangle":
		return new Rectangle();
	  default:
		return null;
	}
  }
}
