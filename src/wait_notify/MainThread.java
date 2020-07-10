package wait_notify;

public class MainThread {
	
	public static void main(String[] args) {
		System.out.println("메인 쓰레드 시작 ");
		
		ThreadB threadB = new ThreadB();
		threadB.start();
		synchronized (threadB) { 
			try {
				threadB.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인 쓰레드 종료 ");
	}


}
