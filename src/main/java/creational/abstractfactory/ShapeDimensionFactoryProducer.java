package creational.abstractfactory;

/**
 * Created by tobilobaowolabi on 31/08/2021
 * Author: tobilobaowolabi
 * Date: 31/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class ShapeDimensionFactoryProducer {
  public static AbstractFactory getFactory(DimensionType dimensionType){
    switch(dimensionType){
	  case TWO_DIMENSIONAL:
	    return new TwoDShapeFactory();
	  case THREE_DIMENSIONAL:
	    return new ThreeDShapeFactory();
	  default:
	    return null;
	}
  }

  public enum DimensionType {
    TWO_DIMENSIONAL, THREE_DIMENSIONAL
  }
}
