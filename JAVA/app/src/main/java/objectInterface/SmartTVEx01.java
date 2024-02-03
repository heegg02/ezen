package objectInterface;

public class SmartTVEx01 {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTV();
		rc.tureOn();
		rc.setVolume(5);
		Searchable sa = new SmartTV();
		sa.search("++URL 주소++");
		
		
	}

}
