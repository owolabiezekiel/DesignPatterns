package behavioural.templatemethod;

/**
 * Created by tobilobaowolabi on 30/08/2021
 * Author: tobilobaowolabi
 * Date: 30/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class Facebook extends BaseNetwork{
  /**
   * You can see that Facebook didnt have to declare its userName and Passwords fields. It got them from the base class
   * Also, this sub class can have other methods that dont even exists in the base class
   */
  public Facebook(String userName, String password) {
	this.userName = userName;
	this.password = password;
	this.networkName = this.getClass().getName();
  }

  //Concrete implementation of the abstract login method
  public boolean logIn(String userName, String password) {
	System.out.println("\nChecking user's parameters");
	System.out.println("Name: " + this.userName);
	System.out.print("Password: ");
	for (int i = 0; i < this.password.length(); i++) {
	  System.out.print("*");
	}
	simulateNetworkLatency();
	System.out.println("\n\nLogIn success on Facebook");
	return true;
  }

  //Concrete implementation of the abstract sendData method
  public boolean sendData(byte[] data) {
	boolean messagePosted = true;
	if (messagePosted) {
	  System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
	  return true;
	} else {
	  return false;
	}
  }


  //Concrete implementation of the abstract logOut method
  public void logOut() {
	System.out.println("User: '" + userName + "' was logged out from Facebook");
  }


  //Other methods not in base class are also allowed
  private void simulateNetworkLatency() {
	char[] networkNameCharacterArray = this.networkName.toCharArray();
	try {
	  int i = 0;
	  System.out.println();
	  while (i < networkName.length()) {
		System.out.print(networkNameCharacterArray[i]);
		Thread.sleep(500);
		i++;
	  }
	} catch (InterruptedException ex) {
	  ex.printStackTrace();
	}
  }
}
