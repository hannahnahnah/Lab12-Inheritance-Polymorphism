import java.util.ArrayList;
import java.util.Scanner;

public class CarApp2 {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		int carChoice = 0;
		String userBuy = null;
		String userContinue = null;
		
		ArrayList<Car> myCars = new ArrayList<>();
		myCars.add(new UsedCar("Chevrolet", "Silverado", 2000, 6000.00, 79324.5));
		myCars.add(new UsedCar("Subaru", "Forrester", 2015, 18000.00, 32487.2));
		myCars.add(new UsedCar("Ford", "Ranger", 2003, 3200.00, 173253.6));
		myCars.add(new Car("Audi", "A6", 2020, 58795.00));
		myCars.add(new Car("Lincoln", "mkZ", 2020, 42750.00));
		myCars.add(new Car("Kia", "Sorrento", 2020, 27335.00));
		
		
		ArrayList<String> usedCars = new ArrayList<>();
			usedCars.add(0, "(Used)");
			usedCars.add(1, "(Used)");
			usedCars.add(2, "(Used)");
		
		
		System.out.printf("%-2s %-10s %-10s %-10s %-10s %-10s\n", "  ", "Make", "Model", "Year", "Price", "Mileage");	
			
		for (int i = 0; i < myCars.size(); ++i) {
			if (myCars.get(i) instanceof UsedCar) {
				UsedCar tempUsedCar = (UsedCar) myCars.get(i);
				
				System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f %-10.1f\n", (i + 1), 
						  myCars.get(i).getCarMake(), 
						  myCars.get(i).getCarModel(), 
						  myCars.get(i).getCarYear(),
						  myCars.get(i).getCarPrice(),
						  tempUsedCar.getCarMileage());
				
			} else {
			System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f\n", (i + 1), myCars.get(i).getCarMake(), 
																			  myCars.get(i).getCarModel(), 
																			  myCars.get(i).getCarYear(),
																			  myCars.get(i).getCarPrice());
		}																	  
		}
		
		do {
			do {
				System.out.print("\nWhich car would you like? (please type a number from the menu): ");
				carChoice = scnr.nextInt();
				scnr.nextLine();
					if (Car.getValidated(carChoice) == false) {
						System.out.println("Invalid input. Please try again.");
					} else {
						System.out.println(myCars.get(carChoice - 1).toString());
					}
				} while (Car.getValidated(carChoice) == false);
		
		System.out.print("\nWould you like to buy this car? (y/n)");
			userBuy = scnr.nextLine();
			if (userBuy.substring(0, 1).equalsIgnoreCase("y")) {
				System.out.println("\nExcellent! Our finance department will be in touch shortly.");
				myCars.remove(carChoice - 1);
			} else {
				break;
			}
		
		System.out.printf("\n%-2s %-10s %-10s %-10s %-10s %-10s\n", "  ", "Make", "Model", "Year", "Price", "Mileage");
		for (int i = 0; i < myCars.size(); ++i) {
			if (myCars.get(i) instanceof UsedCar) {
				UsedCar tempUsedCar = (UsedCar) myCars.get(i);
				
				System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f %-10.1f\n", (i + 1), 
						  myCars.get(i).getCarMake(), 
						  myCars.get(i).getCarModel(), 
						  myCars.get(i).getCarYear(),
						  myCars.get(i).getCarPrice(),
						  tempUsedCar.getCarMileage());
				
			} else {
			System.out.printf("%-2d %-10s %-10s %-10d $%-10.2f\n", (i + 1), 
					myCars.get(i).getCarMake(), 
					myCars.get(i).getCarModel(), 
					myCars.get(i).getCarYear(),
					myCars.get(i).getCarPrice());
			}																	  
		}
		
		System.out.println("\nWould you like to choose another car? (y/n)");
		userContinue = scnr.nextLine();
		
		
		} while (userContinue.substring(0, 1).equalsIgnoreCase("y"));
		

		System.out.println("Have a great day!");
		

	}

}
