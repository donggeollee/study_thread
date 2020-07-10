package shared_object;

public class Shooter_Tom extends Thread{

	
	Gun gun;
	
	public Shooter_Tom(Gun gun) {
		this.gun = gun;
	}
	
	@Override
	public void run() {
		
		gun.shoot(1, 3);
		try {
			Thread.sleep(500); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		super.run();
	}
}
