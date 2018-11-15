package inheritancePolymorphism;

//  this is subclass of the Car class
public class Honda extends Car {

	// data fields
	private boolean hasAirbags;
	private String name;
	
     // no args 
	public Honda() {
		super();
	}
	
	// overloaded
	public Honda(String type, String model, // from super class Vehicle
			String color, int discount, int price, // from super class car
			boolean hasAirbags, String name) // from this class
	{
		super(type, model, color, discount, price);
		this.hasAirbags = hasAirbags;
		this.name = name;

	}
    // getter and setter

	public String getName() {
		return name;
	}

	public boolean isHasAirbags() {
		return hasAirbags;
	}

	public void setHasAirbags(boolean hasAirbags) {
		this.hasAirbags = hasAirbags;
	}

	public void setName(String name) {
		this.name = name;

	}
	
    // create instance method
	public boolean isSafe() {
		if (this.hasAirbags) {
			return true;
		} else {
			return false;
		}
	}
    // display results

	@Override
	public String toString() {
		String str = super.toString();
		str += "\nHasAirbags: " + this.hasAirbags;
		str += "\nName: " + this.name;
		str += "\nSafe Car: " + this.isSafe();

		return str;
	}

}
