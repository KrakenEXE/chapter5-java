package projectFour;

import java.text.NumberFormat;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		Scanner scanner = new Scanner( System.in);
		
		System.out.println("Enter the number days worked >> ");
		double daysWorked = scanner.nextDouble();
		while(daysWorked < 1){
			System.out.println("Error must be more than 1 enter the number days worked >> ");
			daysWorked = scanner.nextDouble();
		}
		double whatMoneyDo =0.01;
		for(int i = 1; i <= daysWorked; i++){
			System.out.println("During day "+i+" you made "+formatter.format(whatMoneyDo));
			whatMoneyDo += whatMoneyDo;
		}
	}

}
