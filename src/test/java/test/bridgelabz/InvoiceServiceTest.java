package test.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InvoiceServiceTest {

	@Test
	void returnInvoiceofRideRepository() {
		InvoiceGenerator invoicegenerator=new InvoiceGenerator();
		double distance=2.0;
		int time=5;
		double fare=invoicegenerator.invoiceofrides(distance, time);
		Assertions.assertEquals(25, fare);
	}
}
