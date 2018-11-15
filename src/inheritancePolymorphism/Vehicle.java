
/* Richa Patel
 *  CIS 2212 Tuesdays Fall 2018
 *  Lab 08 - Inheritance & Polymorphism
 *  Due October 30, 2018 
 */

package inheritancePolymorphism;

//This is Super Class

public class Vehicle {

	// data fields
	private String type;
	private String modelName;

	// no-args
	public Vehicle() {

	}

	// overlodded Constructor
	public Vehicle(String type, String model) {
		this.type = type;
		this.modelName = model;
	}
	// getter and setter

	public String getBrandName() {
		return type;
	}

	public void setBrandName(String type) {
		this.type = type;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	// method - action for all Vehicle
	public boolean isSpeed(int speed) {
		System.out.print("HighSpeed: ");
		if (speed > 100) {
			return true;
		} else
			return false;
	} // end method

	// create Overridden method
	@Override
	public String toString() {
		String str = "\nType: " + this.type;
		str += "\nModelName: " + this.modelName;
		return str;
	}

} // end class
