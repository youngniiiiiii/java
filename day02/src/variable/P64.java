package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		double d =10.235;
		String str1 = "abc";
		String str2 = "abc";
		
		str1 = "def";  //기존 abc 값이 사라지고 바뀌는 것이 아니고 새로운 번지와 def라는 객체가 생성된다.
		
		System.out.printf("%d\t %1.2f\t %s \n",a,d,str1);   //("출력되는 형식", 순서대로 출력) \n은 다음 라인으로 넘어가라는 뜻
		if(str1 == str2) {   //주소값을 비교한 것
			System.out.println("OK");
		}
		if(str1.equals(str2)) {   //String 을 비교한 것 (진짜 abc가 맞냐?)
			System.out.println("OK2");
		}

		String str3 = new String("abc");   //새로운 번지 생성
		String str4 = new String("abc");   //또 새로운 번지 생성

			//str1,2,3,4 다 비교해보기
		
	}
}
