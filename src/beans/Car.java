package beans;

public class Car {
	private String[] carNames;
	private Engine[] engines;
	public String[] getCarNames() {
		return carNames;
	}
	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
public void displayCar() {
	for(String car:carNames) {
		System.out.println(car);
	}
	for(Engine e:engines)
		System.out.println(e);
}
}
