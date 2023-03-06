package inherit.copy;

import java.util.Date;

public class App3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Manager();
		Employee e3 = new Sales();
		
		Object obj1 = new Employee();	//JAVA는 Object라는 클래스에서 상속 받았다.
		Object obj2 = new Manager();
		Object obj3 = new Date();
	}

}
