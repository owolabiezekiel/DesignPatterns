package creational.prototype;

import java.util.Hashtable;

/**
 * Created by tobilobaowolabi on 08/09/2021
 * Author: tobilobaowolabi
 * Date: 08/09/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class ShapeCache {
  private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

  public static Shape getShape(String shapeId) {
	Shape cachedShape = shapeMap.get(shapeId);
	return (Shape) cachedShape.clone();
  }

  // for each shape run database query and create shape
  // shapeMap.put(shapeKey, shape);
  // for example, we are adding three shapes

  public static void loadCache() {
	Circle circle = new Circle();
	circle.setId("1");
	shapeMap.put(circle.getId(),circle);

	Triangle square = new Triangle();
	square.setId("2");
	shapeMap.put(square.getId(),square);

	Rectangle rectangle = new Rectangle();
	rectangle.setId("3");
	shapeMap.put(rectangle.getId(), rectangle);
  }
}
