package test.bridgelabz;

public class InvoiceGenerator {
	private double MINIMUM_COST_PER_KILOMETER=10;
	private int COST_PER_TIME=1;
	private double MINIMUM_FARE=5;

	public double calculateFare(double distance, int time) {
		double totalFare=distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
		return Math.max(totalFare,MINIMUM_FARE);
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare=0;
		for(Ride ride:rides) {
			totalFare=this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
	public double invoiceofrides(double distance, int time) {
		int userid;
		
		for(userid=1;userid<=5;) {
		double totalFare=distance*MINIMUM_COST_PER_KILOMETER+time*COST_PER_TIME;
		return totalFare;
		}
		return userid;
	}
}
