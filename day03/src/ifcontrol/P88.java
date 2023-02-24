package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = ""; //초기화
		String gender = "M";
		double sum = 83.0;
		
		
		System.out.println("Start....");

		if (gender.equals("M")) {
			System.out.println("Male.....");
		}else {
			System.out.println("Female...");
		}
		
		if (sum>=95 && sum <= 100 || sum>=85 && sum<=90) {
			grade = "VIP";
		}else if (sum >=80 && sum <= 75 || sum >=60 && sum <=65){
			grade = "GOLD";
		}else {
			grade = "NORMAL";
		}
		
			
		
		if(grade.equals("VIP")) {
		System.out.println("VIP 혜택....");
		//return;			//행위를 끝내는 의미
		}
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		
		System.out.println("End....");
	}

}
