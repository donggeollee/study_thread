package join;

import ThreadCreate.ThreadExtend;

public class JoinTest extends Thread{

	@Override
	public void run() {
		
		System.out.println("Extend 쓰레드 시작 :" + Thread.currentThread().getName());
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Extend 쓰레드 실행중 : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Extend 쓰레드 종료");
		
		super.run();
	}

	public static void main(String[] args) {
		
		System.out.println("메인 쓰레드 시작 ");
		
		JoinTest threadExtend = new JoinTest();

		threadExtend.start();
		try {
			threadExtend.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료 ");

	}}
