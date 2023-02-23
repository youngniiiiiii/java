package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase();  //소문자 abcdef가 없어지는게 아니고 대문자 ABCDEF가 새로 생김!
		System.out.println(str);

		String str2 = str.replace('A', 'Z');  //주소에 접근할때 .을 쓴다 __.replace -> __의 주소의 값을 바꾸겠다.
		System.out.println(str2);			//ABCDEF가 사라지지 않고 ZBCDEF가 생긴다.
		
		int lng = str.length();   //전체 문자의 길이를 알수 있다. 정수라 int 
		System.out.println(lng);
		
		int t = str.indexOf('B');  //내가 원하는 문자가 몇번째 index인지 알 수 있다. 인덱스는 0부터 시작.
		System.out.println(t);
		
		char c = str.charAt(0);  //0번째 index에 있는 문자는 무엇인지 알 수 있다.
		System.out.println(c);
		
		String str3 = str.substring(1, 3);
		System.out.println(str3);
				
		
		String email = "jmlee@tonesol.com";
		
		String id = "";
		String domain = "";
		
		System.out.print("%s , %s, id, domain");
	}

}
