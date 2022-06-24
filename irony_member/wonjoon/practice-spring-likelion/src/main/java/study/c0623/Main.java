package study.c0623;

/**
 * author : cadqe13@gmail.com
 * date : 2022-06-23
 * description :
 */

public class Main {
	public static void main(String[] args) {

		Car a = new Car("amg", 150L);
		Car b = new Car("k7", 307L);

		a.printSpeed();
		a.setSpeed(350L);

		a.printSpeed();
		b.printSpeed();
	}
}


class Car {
	private String name;
	private long speed;

	public Car(String name, long speed) {
		this.name = name;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSpeed() {
		return speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}

	public void printSpeed() {
		System.out.println(this.name + "의 최고 속력 : " + this.speed);
	}
}