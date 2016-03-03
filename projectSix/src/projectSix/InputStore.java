package projectSix;

import java.util.Scanner;

public class InputStore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Starting size of population >> ");
		Integer startingSize = Integer.parseInt(scanner.nextLine());
		//while for smaller than startingSize<=1
		
		System.out.print("Daily Increase >> ");
		Integer dailyIncrease = Integer.parseInt(scanner.nextLine());
		//while for smaller than dailyIncrease<=-1
		
		System.out.print("Days to multiply >> ");
		Integer daysToMultiply = Integer.parseInt(scanner.nextLine());
		//while for smaller than daysToMultiply<=0
		
		OrganismStore generatedSecenario = new OrganismStore(startingSize, dailyIncrease, daysToMultiply);
		
		generatedSecenario.getDailyPopulation();
	}

}
