package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//API쓰는 방법 2가지....   new와 .으로 쓸수도 있다
		System.out.println("명령어를 입력 하시오(q,i,d,s)");
		String cmd = sc.next();
		System.out.printf("%s를 입력했습니다.", cmd);
		sc.close();
	}
}
