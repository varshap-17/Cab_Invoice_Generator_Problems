package test.bridgelabz;

public class InvoicePremiumRides {
	private double MINIMUM_COST_PER_KILOMETER=15;
	private int COST_PER_TIME=2;
	double MINIMUM_FARE=20;
	
	public double premiumFare(double distance, int time) {
		double totalfare=distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
		
		return Math.max(totalfare,MINIMUM_FARE);
	}
}
