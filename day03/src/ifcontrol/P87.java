package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		double sum = 90.0;
		String grade = "";
		
		if(sum >=90.0 && sum <=100) {
			grade = "VIP";
		}else if(sum >= 80.0 && sum <=100) {
			grade = "GOLD";
		}else if(sum >= 70.0 && sum <=100) {
			grade = "SILVER";
		}else if(sum >= 60.0 && sum <=100) {
			grade = "BRONZE";
		}else if(sum <60 && sum <=100){
			grade = "NORMAL";
		}else {
			grade = "범위초과";
		}
		
		
		
		if(grade.equals("VIP")) {
		System.out.println("VIP 혜택....");
		//return;			//행위를 끝내는 의미
		}
		
		System.out.printf("%s,  %4.2f \n", grade, sum);
		
		System.out.println("End....");
	}

}
