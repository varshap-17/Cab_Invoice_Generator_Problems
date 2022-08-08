package test.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PremiumRidesTest {

	@Test
	void returnPremiumRides() {
		InvoiceGenerator invoicegenerator=new InvoiceGenerator();
		InvoicePremiumRides premiumgenerator=new InvoicePremiumRides();
		double distance=2.0;
		int time=5;
		double fare=invoicegenerator.calculateFare(distance,time);
		double prefare=premiumgenerator.premiumFare(distance, time);
		Assertions.assertEquals(25, fare);
		Assertions.assertEquals(40, prefare);
	}
}
