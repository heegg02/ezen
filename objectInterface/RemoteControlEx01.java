package objectInterface;

public class RemoteControlEx01 {

	public static void main(String[] args) {
		RemoteControl rc; // rc 인터페이스 선언
		
		// television 객체를 생성하고 rc(인터페이스) 변수에 대입(rc로 Television 객체 사용)
		rc = new Television();
		rc.tureOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		rc.tureOff();
		
		rc = new Audio();
		rc.tureOn();
		rc.setVolume(8);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();
		rc.tureOff();
		
	}

}
