package test.bridgelabz;

public class InvoiceSummary {
	private double averageFare;
	private double totalFare;
	private int numOfRides;

	public InvoiceSummary(int numOfRides, double totalFare) {
		this.numOfRides=numOfRides;
		this.totalFare=totalFare;
		this.averageFare=this.totalFare/this.numOfRides;
	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null || getClass()!=o.getClass()) return false;
		InvoiceSummary that=(InvoiceSummary) o;
		return numOfRides==that.numOfRides && Double.compare(this.totalFare, totalFare)==0 && Double.compare(this.averageFare, averageFare)==0;
	}
}
