package projectThree;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class calculate {

		public static void main(String[] args) throws FileNotFoundException
		{
			Scanner keyboard = new Scanner(System.in);
			PrintWriter writer = new PrintWriter("G:/chapter5-projects/projectThree/src/projectThree/file.txt");
			int vehicleSpeed, hoursTraveled;
			
			System.out.println("Enter the speed you are traveling at >> ");
			vehicleSpeed = keyboard.nextInt();
			while(vehicleSpeed <=-1){
				System.out.println("Enter a number that isn't negative >> ");
				vehicleSpeed = keyboard.nextInt();
			}
			System.out.println("Enter the hours you traveled >> ");
			hoursTraveled = keyboard.nextInt();
			while(hoursTraveled <=0){
				System.out.println("Enter a number greater than zero >> ");
				hoursTraveled = keyboard.nextInt();
			}
			input object1 = new input(vehicleSpeed, hoursTraveled);
			
			int countMilesAdd =object1.getMilesTraveled()/hoursTraveled;
			//System.out.println("You traveled "+object1.getMilesTraveled() + " miles");
			writer.println("----------------------------");
			for(int i = 1; i <= hoursTraveled; i++){
				writer.println("During "+i+" hour you traveled "+ countMilesAdd + " miles");
				countMilesAdd += vehicleSpeed;
			}
			//writer.println("For a total of "+object1.getMilesTraveled());
			writer.close();
			
			keyboard.close();
	}
}
