package creational.builder;

/**
 * Created by tobilobaowolabi on 02/09/2021
 * Author: tobilobaowolabi
 * Date: 02/09/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class GPSNavigator {
  private String route;

  public GPSNavigator() {
	this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
  }

  public GPSNavigator(String manualRoute) {
	this.route = manualRoute;
  }

  public String getRoute() {
	return route;
  }
}
