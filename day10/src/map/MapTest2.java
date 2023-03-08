package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		Set<Integer> keys = map.keySet();	//map에서 키값을 끄집어내기..한번에 for문으로는 안된다!!
		System.out.println(keys.toString());
		
		for(int data : keys) {
			System.out.println(map.get(data));	//키값을 끄집어내고 값을 끄집어낸다
		}
	}

}
