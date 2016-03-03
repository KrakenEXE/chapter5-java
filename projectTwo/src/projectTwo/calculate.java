package projectTwo;
import java.util.Scanner;

public class calculate {

		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
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
			int countMilesAdd = object1.getMilesTraveled()/hoursTraveled;
			for(int i = 1; i <= hoursTraveled; i++){
				System.out.println("During "+i+" hour you traveled "+ countMilesAdd + " miles");
				countMilesAdd += vehicleSpeed;
			}
			
			keyboard.close();
	}
}
