package objectInterface;

public class Audio implements RemoteControl {
	private int volume;
	private int memoryVolume;
	
	@Override
	public void tureOn() {
		System.out.println("오디오의 전원을 켭니다.");
		
	}

	@Override
	public void tureOff() {
		System.out.println("오디오의 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오의 볼륨 : " + this.volume);
		
	}
	
	// 디폴트매소드 재정의
		@Override
		public void setMute(boolean mute) {
			if(mute) {
				this.memoryVolume = this.volume;
				System.out.println("무음 처리합니다.");
				setVolume(MIN_VOLUME);
			}else {
				System.out.println("무음 해제합니다.");
				setVolume(this.memoryVolume);
			}
		}
	
}
