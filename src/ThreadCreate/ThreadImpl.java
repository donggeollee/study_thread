package ThreadCreate;

public class ThreadImpl implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Impl 쓰레드 실행중 : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Impl 쓰레드 종료");
	}

	public static void main(String[] args) {
		System.out.println("메인 쓰레드 시작 ");
		
		Thread thread = new Thread(new ThreadImpl());
		thread.start();
		
		System.out.println("메인 쓰레드 종료 ");
		
	}

}
