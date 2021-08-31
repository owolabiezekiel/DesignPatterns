package behavioural.templatemethod;

/**
 * Created by tobilobaowolabi on 30/08/2021
 * Author: tobilobaowolabi
 * Date: 30/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/

/**
 * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created. Because of this it is mostly set to abstract because it sometimes contains
 * abstract method. it is these abstract methods that sub-classes extending the base class must provide implementation for.
 * In this example, we create a Network template and Facebook and Twitter sub-classes that extend the base class and provide concrete implementation for the abstract methods
 * in the base class.
 */
public abstract class BaseNetwork {
  String userName;
  String password;
  String networkName;

  BaseNetwork() {
  }

  /**
   * We want to assume this method works the same for every sub class and that is why we have implemented it here to reduce code duplicates.
   * This however doesnt mean that base classes cannot provide their own implementation of this method
   */
  public boolean post(String message) {
	/**
	 * Authenticate before posting. Every network uses a different authentication method.
	 * so we leave it to the base class to provide the authentication in their login and logout method
	 */
	if (logIn(this.userName, this.password)) {
	  boolean result = sendData(message.getBytes());
	  logOut();
	  return result;
	}
	return false;
  }

  abstract boolean logIn(String userName, String password);

  abstract boolean sendData(byte[] data);

  abstract void logOut();
}
