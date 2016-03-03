package projectSeven;

import java.util.Scanner;
public class RainfallCollection {

	private static int _numberOfYears;
	private static int _month;
	private static int _rainFallPerMonth;
	private static int _totalRainFall;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("Number of years >> ");
		_numberOfYears = scanner.nextInt();
		while(_numberOfYears <=0){
			System.out.print("Incorrect Value make greater than 0 || Number of years >> ");
			_numberOfYears = scanner.nextInt();
		}
		
		for(int i = 0; i <= _numberOfYears-1; i++){	//iterates number of years
			
			for(int m = 1; m <= 12; m++){	//iterates 12 times to represent 12 months
				System.out.print("Rainfall for month "+m+" >> ");
				_rainFallPerMonth = scanner.nextInt();	//gathers total rainfall per month and adds them to total rainfall
				while(_rainFallPerMonth <=-1){
					System.out.print("Incorrect Value must be a positive number || Rainfall for month "+m+" >> ");
					_rainFallPerMonth = scanner.nextInt();
				}
				_totalRainFall += _rainFallPerMonth;
			}
		}
		_month = _numberOfYears * 12;	//keeps track of months
		
		System.out.println("There have been "+_month+" months, and total rainfall was "+_totalRainFall+" inches");
		
	}

}
