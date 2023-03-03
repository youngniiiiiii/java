package inherit.copy;

public class Sales extends Employee {
	private String loc;
	private double rate;
	
	public Sales() {			//default /Con
	}

	
	public Sales(String id, String name, double salary) {  //기본 사원정보 Con
		super(id, name, salary);
	}


	public Sales(String id, String name, double salary, String loc, double rate) { //Sales 사원정보 Con
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}


	@Override
	public String toString() {
		return super.toString() + " " + loc + " " + rate;
	}

	//상위의 getAnnSalary를 재정의!->poly...
	
	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive() * 12);
		return result;
	}
	
	@Override		//Employee에 했으니깐 재정의 해줘야함
	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}
	

	
}
