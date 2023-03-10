package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	private HashSet<Integer> winningNum;
	private double prizeMoney;	//얘를 끄집어내는 getter 세팅
	
	public Lotto() {
		winningNum = new HashSet<Integer>();
	}
	
	public HashSet<Integer> getWinningNum() {
		return winningNum;
	}

	public double getPrizeMoney() {
		return prizeMoney;
	}

	public void makeWinningNumberMoney() {
		Random r = new Random();
		prizeMoney = r.nextInt(2000000000)+1;
		//int로 생성이 되어 doubld타입으로 들어간다.
		while(winningNum.size() < 3) {
			int num = r.nextInt(25)+1;
			winningNum.add(num);
		}
		System.out.printf("%4.0f\n",prizeMoney);
		System.out.println(winningNum.toString());
	}
	
	public int checkRanking(ArrayList<Integer> myNum) throws Exception {
		int grade = 0;
		int cnt = 0;
		for(int num : myNum) {
			for(int prizeNum : winningNum) {
				if(num == prizeNum) {
					cnt++;
				}
			}
		}
		switch(cnt) {
		case 3: grade = 1; break;
		case 2: grade = 2; break;
		case 1: grade = 3; break;
		default: throw new Exception("꽝");
		}		
		return grade;
	}
	
	public double prizeMoney(int grade) {
		double pMoney = 0.0;
		switch(grade) {
		case 1: pMoney = prizeMoney * 0.7; break;
		case 2: pMoney = prizeMoney * 0.2; break;
		case 3: pMoney = prizeMoney * 0.1; break;
		default: pMoney = 0.0;
		}
		return pMoney;
	}
}
	
//	
//}
//
//public class Lotto {
//	private HashSet<Integer> winningNum;
//	private double prizeMoney;
//	
//	Random r = new Random();
//	Set<Integer> set = new HashSet<Integer>();
//
//	int grade = 0;
//
//	
//	public Lotto() {
//	}
//
//	public Lotto(HashSet<Integer> winningNum, double prizeMoney) {
//
//		this.winningNum = winningNum;	
//		if(grade == 1) {
//			this.prizeMoney = 800000000;
//		}else if(grade == 2) {
//			this.prizeMoney = 50000000;
//		}else if(grade == 3) {
//			this.prizeMoney = 1000000;
//		}else {
//			this.prizeMoney = 0;
//		}
//	}
//	
//	
//	public void makeWinningNumberMoney() {
//		while(set.size() < 3) {
//		int luckyNum = r.nextInt(24)+1;
//		set.add(luckyNum);
//		}
//		System.out.println(set);
//	}
//
//	
//	public int checkRanking(ArrayList<Integer> myNum){
//		
//		return 0;
//	}
//	
//	public double prizeMoney(int grade) {
//		
//		return 0;
//	}
//	
//	
//	
//	@Override
//	public String toString() {
//		return "Lotto [winningNum=" + winningNum + ", prizeMoney=" + prizeMoney + "]";
//	}
//	
//}
