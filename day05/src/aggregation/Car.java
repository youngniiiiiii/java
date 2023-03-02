package aggregation;

public class Car {
	//속성
	public String name;
	public String color;
	public int size;
	
	//생성자.(constructor)
	public Car() {				 						//default Constructor
		this.name = "k1";
		this.color = "red";
		this.size = 1000;
	}
	public Car(String name, String color, int size) {   //argument Constructor
		this.name = name;	
		this.color = color;
		this.size = size;
		
	}
	
	
	//행위
	public void go() {
		System.out.println(this.name + "Go car");
		System.out.printf("%s, %s Go car", this.name ,this.color);
	}
	public void stop() {
		System.out.println(this.name + "Stop car");
		System.out.printf("%s, %s Stop car", this.name ,this.color);
	}
	
	@Override // 자동차 정보를 string화 해서 출력하게 해줌
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}
	

}
