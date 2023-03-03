package inherit.copy;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	
	
	public Employee() {
	}


	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public double getAnnSalary() {
		double result = 0.0;
		result = this.salary * 12;
		return result;
	}

	
	

	public double getSalary() {
		return salary;
	}

	public double getIncentive() { 				//Employee에 인센티브를 0을 줘버려!!!!!!!!!!!!
		return 0.0;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
	
}
