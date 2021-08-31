package creational.factory;

import java.util.Scanner;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class Square implements Shape {
  /**
   * The Square class implements the Shape interface and therefore must provide all the  implementations as required by the Shape interface.
   */
  @Override
  public void draw() {
	System.out.println("Inside Square::draw() method.");
  }

  @Override
  public double calculateArea() {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the length of a side of the square: ");
	double length = input.nextDouble();
	double area = length * length;
	System.out.println("Area of the " + this.getClass().getName() + " is: " + area);
	return area;
  }

}
