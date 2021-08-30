package creational.singleton;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/

//This class is created to test the Singleton class
public class SingletonTest {
  public static void main(String[] args) {
    /*
    * We test this class by creating two instances of the Singleton class,
    * We then print the hashcode of the two variables.
    * If they are the same, then it means that the creational.singleton class returns the same instance of creational.singleton for every call to getInstance */

	Singleton singleton1 = Singleton.getInstance();
	Singleton singleton2 = Singleton.getInstance();

	System.out.println(singleton1.hashCode());
	System.out.println(singleton2.hashCode());

  }
}
