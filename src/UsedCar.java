
public class UsedCar extends Car {
	
	protected double carMileage; 
	
	public UsedCar() {
		
	}
	
	public UsedCar(String carMake, String carModel, int carYear, double carPrice, double carMileage) {
		super(carMake, carModel, carYear, carPrice);
		this.carMileage = carMileage;
		
	}

	public double getCarMileage() {
		return carMileage;
	}

	public void setCarMileage(double carMileage) {
		this.carMileage = carMileage;
	}

	@Override
	public String toString() {
		return "UsedCar:   " + carMake + "   " + carModel + "   "
				+ carYear + "   $" + carPrice + "   " + carMileage + "miles.";
	}
	
	

}
