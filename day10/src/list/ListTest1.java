package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random r =new Random();
		for(int i =0; i < 10; i++) {
				//list.add(r.nextInt(10)+1);}
				int num = r.nextInt(10)+1;
				list.add(num);}
//		list.add(10);
//		list.add(20);
//		list.add(30);
		list.add(0, 100);	//0번째 인덱스에 100이 들어간다..
		list.remove(0);
		for(int data:list) {
			System.out.println(data);
		}
	}

}
