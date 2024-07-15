package kadai_014;

public class CarExec_Chapter14 {
	private int gear = 1;
	private int speed = 10;

//コンストラクタ
	public CarExec_Chapter14(int gear, int spped) {
		this.gear = gear;
		this.speed = speed;
	}

//	速度変更
	public void gearChange(final int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");

		switch(afterGear) {
			case 1,2,3,4,5 ->  this.speed = afterGear * 10;
			default -> this.speed = 10;
		}
	}

//	ギアチェンジ後の速度を表示
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
