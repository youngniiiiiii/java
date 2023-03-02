package cthis;

import java.util.Calendar;

public class Employee {
	private String id;
	private String name;
	private int salary;
	
	//constructor 객체 필드를 초기화 시켜주는 역할
	public Employee() {		//default constructor
		//id값이 자동생성되어야 함
		Calendar cal = Calendar.getInstance();  //자동임포트  ctrl+shift+o
		this.id = ""+cal.get(Calendar.YEAR)+cal.get(Calendar.MILLISECOND);   		
		//int 값을 String 타입으로 체인지 또는 valueOfstring으로 체인지 할수 있다.
		
	}
	
	
	public Employee(String name, int salary) {   //id를 안만들면 자동생성
		this();     //constructor 내에서 this()란  위에 default constructor를 호출한다는 것
		this.name = name;
		this.salary = salary;
	}



	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	//getter and setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	//////////////////////////////////////////////////
	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;
		return result;
	}
	public int getAnnSalary() {
		int result = 0;
		result = this.salary * 12;
		return result;
	}
	public double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary() * 0.17;		//겹치는 부분 호출 가능..
		return result;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
