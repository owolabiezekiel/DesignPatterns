package creational.factory;

import java.util.Scanner;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class Rectangle implements Shape{
  /*
   * The Rectangle class implements the Shape interface and therefore must provide all the  implementations as required by the Shape interface. */
  @Override
  public void draw() {
	System.out.println("Inside Rectangle::draw() method.");
  }

  @Override
  public double calculateArea() {
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the length of the rectangle: ");
	double length = input.nextDouble();
	System.out.print("Please enter the width of the rectangle: ");
	double width = input.nextDouble();
	double area = length * width;
	System.out.println("Area of the " + this.getClass().getName() + " is: " + area);
	return area;
  }

}
