package creational.prototype;

/**
 * Created by tobilobaowolabi on 06/09/2021
 * Author: tobilobaowolabi
 * Date: 06/09/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/

/**
 * Learning resources
 * https://www.youtube.com/watch?v=nZ76x13Nm8Q
 * https://refactoring.guru/design-patterns/prototype
 * https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
 */

public class TestPrototype {
  public static void main(String[] args) {
    ShapeCache.loadCache();

    Shape clonedShape = (Shape) ShapeCache.getShape("1");
    System.out.println("Shape : " + clonedShape.getType());

    Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
    System.out.println("Shape : " + clonedShape2.getType());

    Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
    System.out.println("Shape : " + clonedShape3.getType());
  }
}
