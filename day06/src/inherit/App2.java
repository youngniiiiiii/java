package inherit;

public class App2 {

	public static void main(String[] args) {
		// Manager is a Employee 이면
		Employee e = new Manager("100","james", 500, 50);	//이게 가능~~~~~
		//manager m = new Employee("100", "james", 500);  이건 안됨~~~
		
		Employee ea[] = new Employee[5];
		
		ea[0] = new Employee("100","james", 500);
		ea[1] = new Employee("101","james", 500);		//상위클래스 개념에 하위클래스를 담을수 있다.
		ea[2] = new Manager("102","james", 500, 50);	//한번에 넣어서 관리하고 출력할수 있다.
		ea[3] = new Manager("103","james", 500, 50);	//상속을 통해 가능하게 되었다..
		ea[4] = new Sales("104", "james", 500, "Seoul" , 0.35);
	
		for(Employee em :ea) {
			System.out.println(em);					//다형성[Polymorphism]
			System.out.println(em.getAnnSalary());  //같은 명령어지만 각자 다른 연산으로 결과를 도출한다.
													//Sales라는 객체를 Employee라는 타입의 객체배열에 넣었기 때문에
													//Sales에서 선언한 getIncentive()는 안보여요..
													//So!! 상위 클래스에서 설계구현
			if(em instanceof Sales) {				//배열에서 꺼낸 객체가 Sales객체 타입이니??
				Sales s = (Sales)em;				//타입(Type casting)을 바꿔준다
				System.out.println(s.getIncentive());
			}											
		}
	}
}
