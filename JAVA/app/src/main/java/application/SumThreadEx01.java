package application;

public class SumThreadEx01 {
	
	public static void main(String[] args) {
		// Thread 는 병렬 진행
		SumThread sThread = new SumThread();
		sThread.start();
		
		// sThread.join(); 는 sThread의 명령 끝날때까지 대기 
		try {
			sThread.join();
		} catch (InterruptedException e) {
			
		} 
		
		System.out.println("1부터 100까지의 합 = "+ sThread.getSum());
		
	}
	
}
