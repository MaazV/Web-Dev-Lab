package CS231_Project;
import java.util.Scanner;

public class Direction {
	private int xAxis;
	private int yAxis;
	
	
	public Direction(int x, int y) {
		xAxis = x;
		yAxis = y;
	}
	
	public boolean getDirectionFromUser() {
		Scanner in = new Scanner(System.in);

		System.out.println("\nNorth, South, East, West? ");
		String n = in.next();
		n.toLowerCase();
		if (n.equals("north") || n.equals("n")) {
			North();
		}
		else if (n.equals("south") || n.equals("s")) {
			South();
		}
		else if (n.equals("east") || n.equals("e")) {
			East();
		}
		else if (n.equals("west") || n.equals("w")) {
			West();
		}
		else if (n.equals("exit")) {
			return false;
		}
		else {
			System.out.println("Please be clear with directions...");
		}
		//System.out.println("( " + getX() + ", " + getY() + ")"); 
		//I don't think we should ever print out the coordinate to the user, instead, send the coordinate into the location class,
		//and print out the location.
		
		return true;
	}
	
	public void North() {
		yAxis = yAxis + 1;
	}
	
	public void South() {
		yAxis = yAxis - 1;
	}
	
	public void East() {
		xAxis = xAxis + 1;
	}
	
	public void West() {
		xAxis = xAxis - 1;
	}
	
	public int getX() {
		return xAxis;
	}
	
	public int getY() {
		return yAxis;
	}
	


}


