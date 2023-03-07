package remote;

public class Tv implements Remote{

	@Override
	public void turnOn() {
		System.out.println("TV를 켰습니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 껐습니다");
		
	}  //Remote의 기능을 Tv에 탑재
	
}