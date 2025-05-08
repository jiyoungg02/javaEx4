package ch13.unit02;

import java.util.Calendar;

public class Ex05 {
	public static void main(String[] args) {
		MyThread5 t = new MyThread5();
		t.start();
		
		Thread th = new Thread(new MyThreadFive());
		th.start();
		
	}
}

class MyThreadFive implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			try {
				Calendar cal = Calendar.getInstance();
				String s = String.format("%tF %tT", cal, cal);
				System.out.println("Runnable : " + s);
				
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


class MyThread5 extends Thread{
	
	@Override
	public void run() {
		int n = 0;
		
		try {
			while(n < 10) {
				Calendar cal = Calendar.getInstance();
				String s = String.format("%tF %tT", cal, cal);
				n++;
				System.out.println(n + " : " + s);
				
				sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
