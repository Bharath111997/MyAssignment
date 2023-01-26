package week1.day1;

public class Car {
	public void applyBreak() {
	System.out.println("Car stop");
	}
	public void applyGear() {
		System.out.println("1st Gear");
	}
	public void swithOnAc() {
		System.out.println("Ac On");
	}
	public void applyAcclerate() {
		System.out.println("Car move");
	}
public static void main(String[] args) {
	Car object=new Car();
	object.applyBreak();
	object.applyGear();
	object.swithOnAc();
	object.applyAcclerate();
}

	}


