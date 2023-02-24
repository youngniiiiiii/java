package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 숫자를 4개의 2자릿수를 입력 받는다.
		// 만약 2자리수가 아니면 프로그램 종료
		// 평균과 합계를 구합니다.
		// 평균이 90이상이면 A
		// 평균이 80이상이면 B
		// 평균이 70이상이면 C
		// 평균이 60이상이면 D
		// 60미만이면 F
		
		// 합계, 평균, 학점을 출력 하시오
		
		Scanner sc = new Scanner(System.in);  //파이프 꼽고 화면에서 입력 받겠다.
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		
	
		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next());   //한번에처리
		if(ko>=100|| ko<10) {
			sc.close();
			return;
		}			
		System.out.println("영어성적 입력:");
		en = Integer.parseInt(sc.next());
		if(en>=100|| en<10) {
			sc.close();
			return;
		}
		System.out.println("수학성적 입력:");
		ma = Integer.parseInt(sc.next());
		if(ma>=100|| ma<10) {
			sc.close();
			return;
		}
		System.out.println("과학성적 입력:");
		si = Integer.parseInt(sc.next());
		if(si>=100|| si<10) {
			sc.close();
			return;
		}
//		
//		if(ko>=100|| ko<10) {
//			return;
//		}else if(en>=100|| en<10) {
//			return;
//		}else if(ma>=100|| ma<10) {
//			return;
//		}else if(si>=100|| si<10) {
//			return;
//		}else {
		
			
		int sum = 0;
		double ave = 0;
		String grade = "";
		
		sum = ko + en + ma + si;
		ave = (sum)/4.0;
		
		grade = (ave >= 90) ? "A": (ave >= 80) ? "B": (ave >= 70) ? "C": (ave >= 60) ? "D" : "F";
		   
		System.out.printf("합계: %d점 \n평균: %4.2f점 \n학점: %s 등급 \n",sum, ave, grade);
		
		sc.close();
			
		}
	}
