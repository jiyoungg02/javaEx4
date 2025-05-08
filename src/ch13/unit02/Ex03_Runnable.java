package ch13.unit02;

public class Ex03_Runnable {
	public static void main(String[] args) {
		// 스레드 구현 -3 : 익명 클래스를 이용한 스레드 구현
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					for(int i=1; i <= 20; i++) {
						System.out.println("스레드 -> " + i);
						Thread.sleep(200);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		t.start();
		
		try {
			for(int i=1; i<=10; i++) {
				System.out.println("메인 -> " + i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 종료 !!!");
	}
}
