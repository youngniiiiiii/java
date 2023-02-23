package variable;

public class P79 {

	public static void main(String[] args) {
		int credit = 0;		//Local변수 : Class 안에 함수 안에서 선언한 변수 초기화해서 쓰세요.
		String grade = "";  //초기화
		if( credit >= 800) {
			grade = "High";
		}else {
			grade = "Low";
	}
		System.out.println(grade);
	}
	
}
