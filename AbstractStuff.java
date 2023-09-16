abstract class Vehicle {
	abstract void numberOfGears();
}

class Car extends Vehicle {
	void numberOfGears() {
		System.out.println("This vehicle has 5 gears.");
	}
}

class Bike extends Vehicle {
	void numberOfGears() {
		System.out.println("This vehicle has 4 gears.");
	}
}

public class AbstractStuff {
	public static void main(String[] args) {
		Car marutiCar = new Car();
		marutiCar.numberOfGears();
		Car toyotaCar = new Car();
		toyotaCar.numberOfGears();

		Bike kawasakiBike = new Bike();
		kawasakiBike.numberOfGears();
		Bike avengerBike = new Bike();
		avengerBike.numberOfGears();
	}
}