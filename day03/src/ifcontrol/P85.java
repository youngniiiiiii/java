package ifcontrol;

public class P85 {

	public static void main(String[] args) {
		String grade = ""; //초기화
		String gender = "M";
		double sum = 90.0;
		
		
		System.out.println("Start....");

//		if (gender.equals("M")) {
//			System.out.println("Male.....");
//		}else {
//			System.out.println("Female...");
//		}
		//삼항연산자
		
		
		if (sum >= 90.0) {
			grade = "VIP";
		}else if(sum >= 70.0) {
			grade = "GOLD";
		}else {
			grade = "SILVER";
		}
		//삼항연산자
		grade = (sum >= 90.0) ? "VIP": (sum>=70.0) ? "GOLD" : "SILVER";
		
		
//		if(grade.equals("VIP")) {
//		System.out.println("VIP 혜택....");
//		//return;			//행위를 끝내는 의미
//		}
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		
		System.out.println("End....");
	}

}
