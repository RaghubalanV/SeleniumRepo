package week1.day1Assignment;

public class Bike {
public void openFuelTank() {
System.out.println("Fuel tank opened");
}
public void tankFull() {
	System.out.println("Tank is fulled");
}

public static void main(String[] args) {
Bike bk = new Bike();
Car cr = new Car();
bk.openFuelTank();
bk.tankFull();
cr.applyBreak();
cr.soundHorn();
}
}

