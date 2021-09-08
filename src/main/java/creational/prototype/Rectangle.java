package creational.prototype;

import java.util.Scanner;

/**
 * Created by tobilobaowolabi on 08/09/2021
 * Author: tobilobaowolabi
 * Date: 08/09/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class Rectangle extends Shape{
  public Rectangle(){
	type = "Rectangle";
  }

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
