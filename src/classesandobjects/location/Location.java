package classesandobjects.location;

public class Location {
	double longitude;
	double latitude;

	public Location(double longitude, double latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	// referred from https://stackoverflow.com/questions/14431032/i-want-to-calculate-the-distance-between-two-points-in-java
	public static double distance(Location one, Location two) {
		double x1 = one.latitude, y1 = one.longitude;
		double x2 = two.latitude, y2 = two.longitude;
		return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
	}
	
	

	public static void main(String[] args) {
		Location sjsu = new Location(37.333518, -121.881833);
		Location goldenGate = new Location(37.821583640474394, -122.47877943924749);
//		sjsu.distance(goldenGate);
		System.out.println(distance(sjsu, goldenGate));
	
	}
	
}
