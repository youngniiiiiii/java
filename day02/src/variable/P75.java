package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;

		System.out.printf("%d,%d\n", a,b);
		
		int result = ++a + b++;	//++가 앞에 있으면 +1이 더해진 상태  ++가 뒤에 있으면 더하기 전 상태
		System.out.printf("%d,%d\n",a,b);
		System.out.println(result);
		
		System.out.println(5 == 5);
		
		int aa= 10;
		int bb= 10;
		
		System.out.println( (aa++ >= 0) || (bb++ >= 0) );	// | or인데 뒤에값까지 증가됨  || or인데 앞에가 true면 뒤에는 실행X
		System.out.printf("%d,%d\n",aa,bb);
		
		
	}
}
