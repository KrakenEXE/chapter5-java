package projectOne;
import java.util.Scanner;

public class mainCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//establish scanner
				Scanner scanner = new Scanner(System.in);
				int userInput;
				int count = 0;
				
				System.out.print("Press a number from 1 and 50 >> ");
				userInput = scanner.nextInt();
				
				//while loop to run from 1 to input number
				while (userInput > 0 && userInput <= 50)
				{
					count += userInput;
					userInput--;
				}
				
				//output the total counted up
				System.out.println(count);
				
				//close resource flow
				scanner.close();
	}

}
