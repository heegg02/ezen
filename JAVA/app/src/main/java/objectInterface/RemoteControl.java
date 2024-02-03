package objectInterface;


public interface RemoteControl {
	
	// 상수 필드, 인터패이스는 제어자(final, static)를 자동으로 추가
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상매서드
	void tureOn();
	void tureOff();
	void setVolume(int volume);
	
	// 디폴트매서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
