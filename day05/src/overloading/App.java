package overloading;

import access.Employee;

public class App {

	public static void main(String[] args) {  //이름이 같지만 argument가 다르다!!!
		Calulator c = new Calulator();
		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(10, 20));
		System.out.println(c.sum(10, 20, 30, 40));
		
		Employee e = new Employee();
	}

}
