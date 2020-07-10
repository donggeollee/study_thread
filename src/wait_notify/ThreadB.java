package wait_notify;

public class ThreadB extends Thread{
	
	public void run() {
		
		System.out.println("ThreadB 쓰레드 시작 :" + Thread.currentThread().getName());
		ThreadA threadA = new ThreadA();
		threadA.start();
		synchronized (threadA) {
			try {
				threadA.wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		synchronized (this) {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("ThreadB 쓰레드 실행중 : " + i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("ThreadB 쓰레드 종료");
			notify();
		}
	}
}
