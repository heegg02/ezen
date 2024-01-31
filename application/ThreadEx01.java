package application;

import java.awt.Toolkit;

public class ThreadEx01 {

	public static void main(String[] args) {
		// 멀티쓰래드 (Multi Thread)
		Thread bThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				Toolkit tool = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					tool.beep();
					try {
						Thread.sleep(500);
					}catch (Exception e) {
						
					}
				}
				
			}
		});
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
