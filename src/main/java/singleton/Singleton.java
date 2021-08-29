package singleton;

/**
 * Created by tobilobaowolabi on 29/08/2021
 * Author: tobilobaowolabi
 * Date: 29/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/

//Please note that this class and all variable and method names can be named as you like. It doesn't have to carry the singleton name
public class Singleton {
  //Create a private constructor so that objects of this class cannot be created outside the class
  private Singleton(){}

  /*
  * We make this static because the getInstance method uses it and since that is a static method, it can only access static variables.
  * This also ensures that singleton works since a static value is always one per class which means that if you call this method millions of times,
  * it will keep referencing the same singleton variable */
  private static Singleton singleton;

  /*
  * We make this method static because that means we can call this class method without instantiating the class since the singleton
  * class cant be instantiated because it is private */
  public static Singleton getInstance(){
    if(singleton == null){
      singleton = new Singleton();
	}
    return singleton;
  }
}
