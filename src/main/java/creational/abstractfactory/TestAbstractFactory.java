package creational.abstractfactory;

import creational.abstractfactory.AbstractFactory.ShapeType;

import static creational.abstractfactory.AbstractFactory.ShapeType.*;
import static creational.abstractfactory.ShapeDimensionFactoryProducer.*;
import static creational.abstractfactory.ShapeDimensionFactoryProducer.DimensionType.*;

/**
 * Created by tobilobaowolabi on 31/08/2021
 * Author: tobilobaowolabi
 * Date: 31/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class TestAbstractFactory {
  public static void main(String[] args) {
    Shape rectangle = getFactory(TWO_DIMENSIONAL).getShape(RECTANGLE);
    rectangle.draw();
    rectangle.calculateArea();


    AbstractFactory dimensionFactory = new ShapeDimensionFactoryProducer().getFactory(THREE_DIMENSIONAL);
    Shape triangle = dimensionFactory.getShape(TRIANGLE);
    triangle.draw();
    triangle.calculateArea();
  }
}
