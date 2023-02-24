package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		String grade = ""; //초기화
		String gender = "";
		double sum = 83.0;
		
		
		if(gender.equals ("M")) {
			if(sum >= 90) {
				grade = "MVIP";
			}else if(sum >= 80) {
				grade = "MGOLD";
			}else {
				grade = "MNORMAL";	
			}
		}else {
			if(sum >= 90) {
				grade = "FVIP";
			}else if(sum >= 80) {
				grade = "FGOLD";
			}else {
				grade = "FNORMAL";
			}
		
		
		switch(grade) {   //실수는 못들어간다.
		case "FVIP":
		case "MVIP":
			sum +=100;
			break;		//break가 없으면 그냥내려와서 다받음... (관리자의 권한을 부여할때 보통 쓰임)
			
		case "FGOLD":
		case "MGOLD":
			sum +=90;
			break;
			
		default:			//~~의 case가 아니면
			sum +=10;
		}
			
			
		System.out.println("Start....");

		if (gender.equals("M")) {
			System.out.println("Male.....");
		}else {
			System.out.println("Female...");
		}
			
		if(grade.equals("VIP")) {
		System.out.println("VIP 혜택....");
		//return;			//행위를 끝내는 의미
		}
		
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		System.out.println("End....");
		
		}
		}}
