package shared_object;

import java.lang.Thread.State;

public class ThreadStatus {
	
	public static void main(String[] args) {
		
		Shooter_Jack thread = new Shooter_Jack(new Gun(30));
		
		System.out.println(thread.getState());
		thread.start();
		while(thread.getState() != State.TERMINATED) {
			System.out.println(thread.getState());	
//			synchronized (thread) {
//				try {
//					thread.wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
		}
		
		
		
	}

}
