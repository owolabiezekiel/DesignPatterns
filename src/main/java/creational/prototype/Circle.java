package creational.prototype;

import java.util.Scanner;

/**
 * Created by tobilobaowolabi on 08/09/2021
 * Author: tobilobaowolabi
 * Date: 08/09/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class Circle extends Shape{
  @Override
  public void draw() {
	System.out.println("Inside Circle::draw() method.");
  }

  @Override
  public double calculateArea() {
	final double PIE = 3.142;
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter the radius to use: ");
	double radius = input.nextDouble();
	System.out.println("Using pie = " + PIE);
	double area = PIE * radius * radius;
	System.out.println("Area of the " + this.getClass().getName() + " is: " + area);
	return area;
  }
}
