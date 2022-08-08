package test.bridgelabz;

public class MultipleRides {
	private double totalFare=0;
	private double MINIMUM_COST_PER_KILOMETER=10;
	private int COST_PER_TIME=1;
	private double MINIMUM_FARE=5;

	public double calculateFare(Ride[] rides) {
		for(Ride ride:rides) {
			this.calculateFare(ride.distance,ride.time);
		}
		
		return totalFare;
	}

	private double calculateFare(double distance, int time) {
		double totalFare=distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
		return Math.max(totalFare,MINIMUM_FARE);
		
	}
}
