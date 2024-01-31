package application;

public class ThreadEx02 {

	public static void main(String[] args) {
		Thread bThread = new WorkerThread();
		bThread.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("삐");
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				
			}
			
		}
	}
	
}
