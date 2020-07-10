package ThreadCreate;

public class ThreadAnonymous {
	
	public static void main(String[] agrs) {
		System.out.println("메인 쓰레드 시작 ");
		
		Thread threadAnonymous = new Thread() {
			public void run() {
				System.out.println("익명 쓰레드 시작 :" + Thread.currentThread().getName());
				for(int i = 0 ; i < 10 ; i++) {
					System.out.println("익명 쓰레드 실행중 : " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("익명 쓰레드 종료");
			};
		};
		threadAnonymous.start();
		
		
		System.out.println("메인 쓰레드 종료 ");
	}

}
