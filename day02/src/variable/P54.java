package variable;

public class P54 {

	public static void main(String[] args) {
		//boolean
		boolean b1 = 10 > 5;
		
		//정수 default가 int임... 그래서 숫자 끝에 L로 표현해줌
		int n1 =10;
		long n2 = 0L;
		n2 = 2222222222222222222L;
		
		//실수  default가 double임...그래서 숫자 끝에 F로 표현해줌
		double d1 = 1.0;
		float f1 = 1.0F;
		
		double d2 = 1/2;  // 정수와 정수가 연산이 일어나면 무조건 정수가 된다...
		System.out.println(d2); // 0.0이 나옴
		
		double d3 = 10.0/3.0;
		System.out.println(d3);// 3.3333333333333335 나옴
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);
		
		//문자 char
		char c1 = 'A';			//메모리로 들어갈땐 65가 2진수로 들어감..
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2); // A가 나옴 국제 유니코드.. 
		
		//정수와 실수의 연산
	
		int n3 = 10;
		double n4 = 10.0;
		//int result = n3 + n4; // n4를 int로 바꾸는 것은 리스크가 있으니
		double result = n3 + n4; //double로 치환!
		System.out.println(result);
		
		
		
	}

}
