package co.kbstar.frame;

import com.kbstar.dto.UserDTO;

public interface DAO<K,V> {		//제네릭 미리 키값을 정해놓는 것
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
}
