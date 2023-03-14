package com.kbstar.frame;

import java.util.Calendar;

public class MakeItemNumber {
	public static int cnt = 100;
	public static int cnt2 = 100;
	public static String makeItemNum() {
		String trNum = "";
		Calendar cal = Calendar.getInstance();
		trNum = "" + cal.get(Calendar.YEAR)
		            + (cal.get(Calendar.MONTH)+1)
		            + cal.get(Calendar.DAY_OF_MONTH)
		            + cal.get(Calendar.MILLISECOND)
		            + cnt2;
		cnt2++;
		return trNum;
	}
	public static String makeCartNum() {
		String accNum = "";
		Calendar cal = Calendar.getInstance();
		accNum = "" + cal.get(Calendar.YEAR)
			        + (cal.get(Calendar.MONTH)+1)
			        + cal.get(Calendar.DAY_OF_MONTH)
			        + cal.get(Calendar.MILLISECOND)
			        + cnt;
		cnt++;
		return accNum;
	}
}




//package com.kbstar.frame;
//
//import java.util.Calendar;
//
//public class MakeAccountNumber {
//	
//	//필드가 없음!!!
//	
//	//static이란 클래스의 필드가 없는 상황에서 나는 makeAccNum의 기능만 사용하겠다!!!
//	public static String makeAccNum() {
//		String accNum = "";
//		Calendar cal = Calendar.getInstance();
//		accNum = "" + cal.get(Calendar.YEAR)
//					+ (cal.get(Calendar.MONTH)+1)
//					+ cal.get(Calendar.DAY_OF_MONTH)
//					+ cal.get(Calendar.MILLISECOND);
//					
//		return accNum;
//	}
//}
