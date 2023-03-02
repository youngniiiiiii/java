package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();	//Service의 기능을 이용하여 화면 입력값들을 등록/수정/삭제 할거야.
		
		while(true) {
			System.out.println("Input cmd(r,u,d,g,q)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("r")) {
				System.out.println("Input contents");
				String content = sc.next();
				service.register(content);
			}else if(cmd.equals("g")) {
				System.out.println("Input number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				System.out.println(result);
			}else if(cmd.equals("u")) {
				System.out.println("Input number & contents for update");
				int num = Integer.parseInt(sc.next());
				String content = sc.next();
				service.modify(num, content);
			}else if(cmd.equals("d")) {
				System.out.println("Input number for delete");
				int num = Integer.parseInt(sc.next());
				service.remove(num);
			}
		}
		sc.close();
	}

}
