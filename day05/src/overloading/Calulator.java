package overloading;

public class Calulator {
	public int sum(int a, double b) {    //return타입은 신경안쓰나 argument만 신경씀
		int result = 0;
		result = a + (int)b;
		return result;   // return = a + b; 한줄로 표현 가능
	}
	public int sum(int a, int b) {
		int result = 0;
		result = a + b ;
		return result;   
	}
	public int sum(int a, int b, int c, int d) {
		int result = 0;
		result = a + b + c + d;
		return result;   
	}
}
