package projectEight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class SentinelValue {

	private static int _largest;
	private static int _smallest;
	private static int _sentinel=0;
	private static int _given;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		
		ArrayList <Integer> list = new ArrayList<>();
		while(_sentinel!= -99){
			
			System.out.print("Enter a number or -99 to stop >> ");
			_given = scanner.nextInt();//enter numbers for a series
			if(_given != -99)
			{
				list.add(_given);
			}
			_sentinel = _given;//assign number to sentinel for a check
			
		}
		//for (int value : list) {
		   // System.out.println(value);	//prints the entire arraylist out
		//}
		System.out.println("Loop Terminated");
		Collections.sort(list);
		System.out.println("The minimum >> "+Collections.min(list));//pull largest number out
		
		
		System.out.println("The maximum >> "+Collections.max(list));//pull smallest number out
	}

}
