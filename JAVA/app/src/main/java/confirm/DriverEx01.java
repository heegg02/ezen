package confirm;

public class DriverEx01 {

	public static void main(String[] args) {
		// 매개변수의 다형성
		Driver chulsu = new Driver();
		Texi myTexi = new Texi();
		chulsu.drive(myTexi);
		
		Driver gildong = new Driver();
		Bus bBus = new Bus();
		gildong.drive(bBus);
		
		Driver chanho = new Driver();
		Truck dumpTruck = new Truck();
		chanho.drive(dumpTruck);
		
	}

}
