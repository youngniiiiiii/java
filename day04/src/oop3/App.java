package oop3;

public class App {

	public static void main(String[] args) {
		Car car = new Car("C1", "red", 1000, 50);
		System.out.println(car.toString());
		car.go(10);
		car.setCfsize(30);
		car.go(100);
		System.out.println(car.toString());
	}
}
