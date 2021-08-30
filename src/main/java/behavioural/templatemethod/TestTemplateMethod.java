package behavioural.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tobilobaowolabi on 30/08/2021
 * Author: tobilobaowolabi
 * Date: 30/08/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public class TestTemplateMethod {
  /**
   * This class was created to test the Template Method Pattern
   */
  public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	BaseNetwork network = null;
	System.out.print("Input user name: ");
	String userName = reader.readLine();
	System.out.print("Input password: ");
	String password = reader.readLine();
	System.out.print("Input message: ");
	String message = reader.readLine();

	System.out.println("\nChoose social network for posting message.\n" +
		"1 - Facebook\n" +
		"2 - Twitter");
	int choice = Integer.parseInt(reader.readLine());

	// Create proper network object and send the message. both subclasses can be of type base class and that is why we are able to select any one of them.
	if (choice == 1) {
	  network = new Facebook(userName, password);
	} else if (choice == 2) {
	  network = new Twitter(userName, password);
	}
	network.post(message);
  }
}
