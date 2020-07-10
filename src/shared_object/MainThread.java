package shared_object;

import java.lang.Thread.State;

public class MainThread {

	public static void main(String[] args) {
		
		Gun gun = new Gun(30);
		
		Shooter_Jack shooterJack = new Shooter_Jack(gun);
		Shooter_Tom shooterTom = new Shooter_Tom(gun);
		while ( gun.getBullet() > 0 ) {
			
			System.out.println("shooterJack.getState() : " + shooterJack.getState());
			System.out.println("shooterTom.getState() : " + shooterTom.getState());
			if( shooterJack.getState() == State.NEW ) {
				shooterJack.start();
				try {
					shooterJack.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if( shooterTom.getState() == State.NEW ) {
				shooterTom.start();
				try {
					shooterTom.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
