package creational.prototype;

/**
 * Created by tobilobaowolabi on 08/09/2021
 * Author: tobilobaowolabi
 * Date: 08/09/2021
 * Project: DesignPatterns
 * IDE: IntelliJ IDEA
 **/
public abstract class Shape implements Cloneable{
  private String id;
  protected String type;

  abstract void draw();
  abstract double calculateArea();
  public String getType(){
	return type;
  }

  public String getId() {
	return id;
  }

  public void setId(String id) {
	this.id = id;
  }

  public Object clone() {
	Object clone = null;

	try {
	  clone = super.clone();

	} catch (CloneNotSupportedException e) {
	  e.printStackTrace();
	}

	return clone;
  }
}
