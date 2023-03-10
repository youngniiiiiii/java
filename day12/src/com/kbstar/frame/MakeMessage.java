package com.kbstar.frame;

public class MakeMessage {	//에러코드에 따라 메세지 내용출력이 가능하다
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
			case "ER0001": result = "계좌개설 실패.."; break;
			case "EX0002": result = "음수 입력.."; break;
			case "EX0003": result = "잔액부족.."; break;
			case "IEX0001": result = "상품등록실패.."; break;
			case "IEX0002": result =
					"상품등록 먼저 하세요.."; break;
			case "IEX0003": result = "상품정보없음.."; break;
		default: result = "고객센터에 문의 하세요";
		}
		return result;
	}
}
