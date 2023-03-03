package inherit.copy;

public class Manager extends Employee{		//상속되었다..(toString까지)
	
	private double bonus;

	//constructor는 상속이 안된다
	
	public Manager() {
		super();
		
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
		
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	//상위 함수를 그대로 쓸수도 있지만, 필요시
	//함수의 재정의(overriding)도 가능하다.
	
	@Override   //오버라이드된 함수입니다라는 어노케이션
	public double getAnnSalary() {
		double result = 0.0;
		result = (this.getSalary() + this.bonus) * 12;		  //manager클래스 안에서 employee의 salary가 안보임
	//이렇게도 가능= super.getAnnSalary() + (this.bonus * 12);
		return result;										  //salary를 protected로 바꾸어 주거나,
	}														  //salary에 getter를 하고 getSalary로 가져오기

	@Override
	public String toString() {
		return super.toString() + " " + bonus;
	}
	
}
