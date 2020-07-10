package demonThread;

public class DemonThread {

	
	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				System.out.println("백그라운드 데몬 쓰레드 실행");
			};
		};
		
		// linux, unix 에서 백그라운드로 실행
		// window 에서 서비스로 실행
		thread.setDaemon(true); 
		
		thread.start();
	}
}
