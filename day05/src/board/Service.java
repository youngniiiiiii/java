package board;

public class Service {  // App 화면에서 누른 기능들
	
	DAO dao;
	
	public Service() {		//Service라는 객체 생성이 될때 DAO객체도 생성이 되도록 해주세요.
		dao = new DAO();
	}
	public void register(String str) {  
		// Security or Log  글을 DB에 넣기전에 처리하는 부분
		dao.insert(str); //Dao에다가 던진다.  Dao에서 DB로 넣는다.
	}
	public void remove(int num) {
		dao.delete(num);
	}
	public void modify(int num, String str) {
		dao.update(num, str);
	}
	public String get(int num) {
		return dao.select(num);
	}

}
