package shared_object;

public class Gun {
	
	int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
		System.out.printf("총알이 %d 발 장전 되었습니다\n", bullet);
	}
	
	public  void shoot(int who, int shootingCount) {
		
		if ( who == 1 ) {
			for ( int i = 0 ; i < shootingCount ; i++) {
				System.out.println("Tom이 총을 쐈습니다.");
				this.bullet -= 1;
			}
		} else if ( who == 2 ) {
			for ( int i = 0 ; i < shootingCount ; i++) {
				System.out.println("Jack이 총을 쐈습니다.");
				this.bullet -= 1;
			}
		}
		
		System.out.println("남은 총알 : " + this.bullet);
	}
	
	public int getBullet() {
		return this.bullet;
	}
	

}
