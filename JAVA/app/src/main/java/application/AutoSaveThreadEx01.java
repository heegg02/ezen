package application;

public class AutoSaveThreadEx01 {

	public static void main(String[] args) {
		AutoSaveThread autoSave = new AutoSaveThread();
		
		// autoSave.setDaemon : autoSave 를 DaemonThread 로 지정 mainThread 가 끝나면 DaemonThread(autoSave) 는 자동 종료
		autoSave.setDaemon(true);
		autoSave.start();
		
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			
		}
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		
		System.out.println("1부터 100까지의 합 = " + sum);

	} // mainThread 끝

}
