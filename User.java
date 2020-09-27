package CS231_Project;
import java.util.Scanner;

public class User {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! Welcome to our game. What would you like to be called?");
		String userName = scanner.next();
		
		//Have to enter locations in underlined parts
		System.out.println("Hello " + userName + "! You are currently in the ____. You can move either to the north," 
				+ " south, east, or west from here. \nPlease enter the cardinal direction corresponding"
				+ "to the location you would like to move to, or just the first letter (N for North). \n\n"

				+ "The goal of this game is to find your way to the ____, where you will pick "
				+ "up three ____, and take them back to ___, ___, and ___. \nBe sure to keep track of "
				+ "where these three locations are, as you will have to find your way back to them\n\n"
				
				+ "Enter exit at any time to end the game\n");
		
	

		Direction dir = new Direction(0,0);
		
		boolean play = true;
		while (play) {
			play = dir.getDirectionFromUser();
			
			int xAxis = dir.getX();
			int yAxis = dir.getY();
			
			Location location = new Location(xAxis,yAxis);
			location.getLocation();
			
		}
		
		System.out.println("Thank you for playing our game!");
		
	
	}
	

}
