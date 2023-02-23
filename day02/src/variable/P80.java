package variable;

public class P80 {

	public static void main(String[] args) {
		int credit = 900;		//Local변수 : Class 안에 함수 안에서 선언한 변수 초기화해서 쓰세요.
		String grade = (credit >= 800) ? "High" : "Low" ;  //삼항연산자
		
		System.out.println(grade);
	}
	
}
