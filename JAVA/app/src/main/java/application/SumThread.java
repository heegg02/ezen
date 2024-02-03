package application;

public class SumThread extends Thread {
	// 필드(맴버 변수)
	private int sum;

	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
	}
	
}
