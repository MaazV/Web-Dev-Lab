package CS231_Project;

public class Location {
	private int xAxis;
	private int yAxis;
	
	
	public Location(int x, int y) {
		xAxis = x;
		yAxis = y;
	}
	
	public void getLocation(){
		if((xAxis == 0) && (yAxis == 1)) {
			location1();
		}
		if((xAxis == 0) && (yAxis == 2)) {
			location2();
		}
	}

	private void location1() {
		System.out.println("You are now in the _____....");
	}
	
	private void location2() {
		System.out.println("You are now at ______ ....");
	}
}
