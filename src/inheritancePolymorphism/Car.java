package inheritancePolymorphism;

import java.text.NumberFormat;

//this is the SUBCLASS of the Vehicle class
//this is also the SUPERCLASS of the Honda class

public class Car extends Vehicle {

	// create data fields
	private String color;
	private int discount;
	private int price;

	// no-args Constructor
	public Car() {
		super(); // no-arg constructor of the subclass access the no-arg constructor of the super
					// class
	}

	// overloded constructor
	public Car(String type, String model, // from Super class vehical
			String color, int discount, int price) {
		super(type, model);
		this.color = color;
		this.discount = discount;
		this.price = price;

	}

	// getter and setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// create method to count Original price
	public int oriPrice() {
		int oriPrice = price - discount;
		return oriPrice;
	}

	// display results
	@Override
	public String toString() {

		// create an object for currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		String str = super.toString();
		str += "\nCar Final Price: " + currency.format(this.oriPrice());
		str += "\nColor: " + this.color;

		return str;
	}

}// end class
