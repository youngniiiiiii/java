package co.kbstar.frame;



public interface DAO<K,V> {		//제네릭 미리 키값을 정해놓는 것
	//(public static final)이 생략되어 있음
	String ip = "127.0.0.1"; //이 아이피로 접속하라고 권고사항 내려옴
		//->변수가 아니고 상수이다.
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	
	default void connect() {
		System.out.println(ip+"에 접속 하였습니다.");
	}
	default void close() {
		System.out.println(ip+"에 접속을 해제 하였습니다.");
	}
}
