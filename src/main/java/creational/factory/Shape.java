package creational.factory;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public interface Shape {
  /**
   * The creational.factory pattern is a creational pattern. We code to a common interface and then we have a dedicated class that creates objects
   * that implement this interface based on certain criterias. For example, the Circle, Triangle, Rectangle shapes could all implement the shape interface
   * and then we create any of these implementations based on what the user provides.
   * Any class that implements the Shape interface must provide concrete implementations of the two methods below
   */

  public void draw();

  public double calculateArea();
}
