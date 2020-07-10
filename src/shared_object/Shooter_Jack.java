package shared_object;


public class Shooter_Jack extends Thread{
	
	Gun gun;
	
	public Shooter_Jack(Gun gun) {
		this.gun = gun;
	}
	
	@Override
	public void run() {
		
		gun.shoot(2, 2);
			
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		
		
//		super.run();
	}

}
