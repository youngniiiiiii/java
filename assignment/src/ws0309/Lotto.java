package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Lotto {
	private HashSet<Integer> winningNum;
	private double prizeMoney;
	
	Random r = new Random();
	
	int grade = 0;

	public Lotto() {
		winningNum = new HashSet<Integer>();
	}
//	public Lotto(HashSet<Integer> winningNum, double prizeMoney) {
//
//		this.winningNum = winningNum;	
//		this.prizeMoney = prizeMoney;
//		
//	}
	
	
	public void makeWinningNumberMoney() {
		while(winningNum.size() < 3) {
		int luckyNum = r.nextInt(24)+1;
		winningNum.add(luckyNum);
		}
		System.out.println(winningNum);
	}

	
	public int checkRanking(ArrayList<Integer> myNum) throws Exception{
		int grade = 0;
		int cnt = 0;
		for(int num : myNum) {
			for(int luckyNum :winningNum) {
				if (num == luckyNum) {
					cnt++;
				}
			}	
		}
		switch(cnt) {
		case 3 : grade = 1; break;
		case 2 : grade = 2; break;
		case 1 : grade = 3; break;
		default: throw new Exception("꽝!");
		}
		return grade;
		
	}
	
	public double prizeMoney(int grade) {
		double pMoney = 0.0;
		if(grade == 1) {
			pMoney = 800000000;
		}else if(grade == 2) {
			pMoney = 50000000;
		}else if(grade == 3) {
			pMoney = 1000000;
		}
		return pMoney;
	}
	

	@Override
	public String toString() {
		return "Lotto [winningNum=" + winningNum + ", prizeMoney=" + prizeMoney + "]";
	}
	
}
