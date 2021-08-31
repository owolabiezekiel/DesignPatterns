package creational.factory;

import java.util.Scanner;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class Triangle implements Shape {
  /**
   * The Triangle class implements the Shape interface and therefore must provide all the implementations as required by the Shape interface.
   */
  @Override
  public void draw() {
	System.out.println("Inside Triangle::draw() method.");
  }

  @Override
  public double calculateArea() {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the base of the rectangle: ");
	double base = input.nextDouble();
	System.out.print("Please enter the height of the rectangle: ");
	double height = input.nextDouble();
	double area = 0.5 * (base * height);
	System.out.println("Area of the " + this.getClass().getName() + " is: " + area);
	return area;
  }
}
