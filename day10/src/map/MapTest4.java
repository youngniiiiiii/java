package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kbstar.dto.UserDTO;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String, UserDTO> db = new HashMap<String, UserDTO>();  //db는 데이터베이스 저장소이다,,...
		db.put("id01", new UserDTO("id01", "pwd01", "james"));
		db.put("id02", new UserDTO("id02", "pwd02", "james"));
		db.put("id03", new UserDTO("id03", "pwd03", "james"));
		
		UserDTO u = db.get("id02");
		System.out.println(u);
		
		UserDTO uu = new UserDTO("id02", "0000", "james2");
		db.put(uu.getId(), uu);
		System.out.println(uu);
		
		Collection<UserDTO> col = db.values();
		for(UserDTO user:col) {
			System.out.println(user);
		}
	}

}
