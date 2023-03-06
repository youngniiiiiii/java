package db;
						
public class OracleDAO implements DAO{//인터페이스 구현시..DAO의 기능을 구현하겠다 라는 뜻임

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted Oracle Database");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted Oracle Database");
		
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("Updated Oracle Database");
		
	} 

}
