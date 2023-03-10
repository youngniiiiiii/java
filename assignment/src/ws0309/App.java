package ws0309;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Lotto lotto = new Lotto();
		int grade = 0;
		while(true) {
			System.out.println("Input cmd..(q.s.c.p)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				break;
			}else if(cmd.equals("s")) {
				System.out.println("Make Number and Prize Money");
				lotto.makeWinningNumberMoney();
			}else if(cmd.equals("c")) {
				System.out.println("Input 3 number :");
				int num1 = Integer.parseInt(sc.next());
				int num2 = Integer.parseInt(sc.next());
				int num3 = Integer.parseInt(sc.next());
				ArrayList<Integer> nums = new ArrayList<Integer>();
				nums.add(num1);
				nums.add(num2);
				nums.add(num3);
				try{
					grade = lotto.checkRanking(nums);
				}catch (Exception e) {
					System.out.println(e.getMessage());
					continue;
				}
				System.out.println(grade);
			}else if(cmd.equals("p")) {
				System.out.printf("총 당청금 %4.1f\n",lotto.getPrizeMoney());
				System.out.printf("당신의 등수 %d\n",grade);
				System.out.printf("당신의 당첨금 %4.0f\n",lotto.prizeMoney(grade));
			}
		}
		sc.close();
	}
}

	
	
//	public static void main(String[] args) {
//		Lotto lotto = new Lotto();
//		ArrayList<Integer> mynum = new ArrayList<Integer>();
//		System.out.println("로또번호");
//		lotto.makeWinningNumberMoney();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1에서 25사이 행운번호 3개를 입력하세요.");
//		int num1 = Integer.parseInt(sc.next());
//		int num2 = Integer.parseInt(sc.next());
//		int num3 = Integer.parseInt(sc.next());
//
//		mynum.add(num1);
//		mynum.add(num2);
//		mynum.add(num3);
//		
//		System.out.println(mynum);
//	}
//	}
		
