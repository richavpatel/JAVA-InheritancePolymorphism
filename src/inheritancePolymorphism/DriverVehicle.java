package inheritancePolymorphism;

public class DriverVehicle {

	public static void main(String[] args) {

		Vehicle veh1 = new Vehicle("Bicycle", "Suzuki"); // object of vehicle
		Car car1 = new Car("Car", "Toyota", "Black", 20, 45000); // create object of car
		Honda honda1 = new Honda("Car", "Honda", "Red", 19, 60000, true, "CRV"); // create object of Honda

		// display 3 objects of vehicle, car, Honda
		System.out.println(veh1.toString());
		System.out.println(car1.toString());
		System.out.println(honda1.toString());

		// create 2 objects of car and honda

		Vehicle car2 = new Car("Car", "Hundai", "Red", 10, 20000); // actual type Car and declare type = Vehicle Super
																	// class

		Vehicle honda2 = new Honda("Car", "Honda", "Gray", 25, 25000, true, "Accord"); // actual type Honda & declare
																						// type = Vehicle

		// display 2 objects car2 and honda2 using toString
		System.out.println(car2.toString());
		System.out.println(honda2.toString());

	} // end main

}// end class
