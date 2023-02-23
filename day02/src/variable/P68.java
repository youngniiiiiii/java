package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s1 = "10";
		int s2 = Integer.parseInt(s1); // 이런것이 API임
		System.out.println(s1 + 10); // 1010이 나옴. String과 일반타입을 여산하면 강제로 String으로 바뀜
		int a = 10;
		System.out.println(s1 + a); // 1010이 나옴....
		System.out.println(s2 + a); // 20이 나옴..
		int n1 = 10; // int를 String으로 바꾸려면..
		String n2 = String.valueOf(n1);
		System.out.println(n2);// String n2 = n1 + "";
		Random r = new Random();  //48비트의 시드를 이용해서 랜덤으로 숫자를 발생시킴
		int rndNum = r.nextInt(10)+1 ;  //10을 제외한 0~9까지 , +1 하면 1~10까지
		System.out.println(rndNum);
	}

}
