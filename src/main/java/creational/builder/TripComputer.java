package creational.builder;

/**
 * Created by tobilobaowolabi on 02/09/2021
 * Author: tobilobaowolabi
 * Date: 02/09/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class TripComputer {
  private Car car;

  public void setCar(Car car) {
	this.car = car;
  }

  public void showFuelLevel() {
	System.out.println("Fuel level: " + car.getFuel());
  }

  public void showStatus() {
	if (this.car.getEngine().isStarted()) {
	  System.out.println("Car is started");
	} else {
	  System.out.println("Car isn't started");
	}
  }
}
