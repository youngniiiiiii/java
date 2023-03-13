package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws Exception {
		int grade = 0;
		Lotto lotto = new Lotto();
		ArrayList<Integer> mynum = new ArrayList<Integer>();
		System.out.println("로또번호");
		lotto.makeWinningNumberMoney();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1에서 25사이 행운번호 3개를 입력하세요.");
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		int num3 = Integer.parseInt(sc.next());

		mynum.add(num1);
		mynum.add(num2);
		mynum.add(num3);
		try {
		System.out.println("입력한 숫자는" + mynum + "입니다.");
		grade = lotto.checkRanking(mynum);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		System.out.printf("당신의 등수는 %d 등으로 상금은 %4.2f 원입니다.", grade, lotto.prizeMoney(grade));
		
	sc.close();
	}
}
		
