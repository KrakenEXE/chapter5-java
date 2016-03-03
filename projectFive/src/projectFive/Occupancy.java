package projectFive;

import java.util.Scanner;

public class Occupancy {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		
		System.out.print("How many floors are there >> ");
		int totalFloors = scanner.nextInt();
		while(totalFloors<=0){
			System.out.println("ERROR: Must be more than Zero Floor's >> ");
			totalFloors = scanner.nextInt();
		}
		double totalOccupied =0;
		double totalRooms =0;
		for(int i = 1; i<= totalFloors; i++){
			System.out.println("How many rooms are on floor "+i+" >> ");
			double roomsOnFloor = scanner.nextDouble();
			while(roomsOnFloor<=9){
				System.out.println("ERROR: More than 9 rooms please - How many rooms are on floor "+i+" >> ");
				roomsOnFloor = scanner.nextDouble();
			}
			totalRooms +=roomsOnFloor;
			System.out.println("How many rooms on floor "+i+" are occupied >> ");
			double occupiedRooms = scanner.nextDouble();
			totalOccupied +=occupiedRooms;
		}
		double occupencyRate =  totalOccupied / totalRooms;
		double vacancy = totalRooms-totalOccupied;
		System.out.println("The hotel is "+totalFloors+" stories tall and has "+totalRooms+" total rooms. There are "+vacancy+" empty rooms and "+totalOccupied+" total occupied rooms. With an occupency rate of "+(occupencyRate*100)+"%.");

	}

}
