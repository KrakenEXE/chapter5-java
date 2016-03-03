package projectTwelve;
import java.util.ArrayList;
import java.util.Scanner;
public class BarChart {

	private static int inputNumber;
	private static int outputAsterisks;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i = 1; i <=5; i++){
		System.out.print("Enter today's sales for the store "+i+" >> ");
		inputNumber = scanner.nextInt();
		outputAsterisks = inputNumber / 100;
		list.add(outputAsterisks);
		}
		
		//convert to asterisks
		for(int x = 0; x<=4;x++){
			System.out.print("Store "+(x+1)+": ");
			for(int i = 0; i < list.get(x); i++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int i = 0; i<=4;i++){
		//	System.out.println("Store "+(i+1)+": "+list;
		}
	}

}
