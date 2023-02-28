package oop1;

public class App2 { //자동차 Go Stop 시뮬레이션 프로그램

	public static void main(String[] args) {
		Car car1 = new Car("k2","blue",2000);  //객체를 만들때 속성 셋팅
		car1.go();
		car1.stop();
		System.out.println("-----------------------------------------");
		Car car2 = new Car("k3","white",3000);  //객체를 만들때 속성 셋팅
		car2.go();
		car2.stop();	
		
	}

}
