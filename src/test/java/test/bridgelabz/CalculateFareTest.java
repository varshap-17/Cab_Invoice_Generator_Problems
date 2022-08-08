package test.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculateFareTest {

	@Test
	void totalFaretest() {
		InvoiceGenerator invoicegenerator=new InvoiceGenerator();
		double distance=2.0;
		int time=5;
		double fare=invoicegenerator.calculateFare(distance,time);
		Assertions.assertEquals(25, fare);
	}
}
