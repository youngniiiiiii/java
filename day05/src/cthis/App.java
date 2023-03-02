package cthis;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("이종석", 500);
		System.out.println(e);
		Employee e2 = new Employee("이종석2", 500);
		System.out.println(e2);

		Date d = new Date();
		java.sql.Date dd = (java.sql.Date) new Date(); 
		//두개를 임포트해서 쓸수는 없다!! so 원 패키지 이름까지 써서 불러와야 함!!
	}

}
