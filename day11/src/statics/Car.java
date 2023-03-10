package statics;

public class Car {
	private String name;
	private String maker;
	public static String makerName = "HD";//객체 생성시 관여를 안함...
	//static은 class가 주인

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}
	

	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}
	
	
}
