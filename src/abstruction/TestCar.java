package abstruction;

public class TestCar {

	public static void main(String[] args) {
		
		Car corolla = new Toyota (); 
		
		corolla.shape();
		corolla.wheel();
		corolla.start();
		corolla.stop();
		
		Toyota lexus = new Toyota();
		lexus.colour();

	}

}
