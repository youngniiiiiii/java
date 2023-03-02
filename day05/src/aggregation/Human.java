package aggregation;

public class Human {
	private String name;
	private Car car;	//Human은 car를 가지고 있다. 여러대 갖고있다 -> 배열.
	
	public Human() {
	}
	
	public Human(String name) {		//차가 없는 사람도 있을 수 있다.
		this.name = name;
	}

	public Human(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}
	
	public void drive() {
		car.go();
	}
	public void stopCar() {
		car.stop();
	}
	
}
