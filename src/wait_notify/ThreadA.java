package wait_notify;

public class ThreadA extends Thread{
	
	public void run() {
		synchronized (this) {
			System.out.println("ThreadA 쓰레드 시작 :" + Thread.currentThread().getName());
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("ThreadA 쓰레드 실행중 : " + i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("ThreadA 쓰레드 종료");
			notify();
		}
		
	}
}
