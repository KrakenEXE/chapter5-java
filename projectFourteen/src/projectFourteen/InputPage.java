package projectFourteen;

import java.util.Scanner;
import java.io.*;
public class InputPage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in);
		System.out.println("What's the file name");
		String fileName = scanner.nextLine();
		//feed filename to constructor
		String hello;
		FileDisplay newObjectString = new FileDisplay(fileName);

	}

}
