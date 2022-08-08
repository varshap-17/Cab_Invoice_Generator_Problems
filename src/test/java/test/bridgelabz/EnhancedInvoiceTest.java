package test.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnhancedInvoiceTest {

	@Test
	void ReturnInvoiceSummary() {
		InvoiceGenerator invoicegenerator=new InvoiceGenerator();
		Ride[] rides= {new Ride(2.0, 5),
				new Ride(0.1, 1)
		};
		InvoiceSummary summary=invoicegenerator.calculateFare(rides);
		InvoiceSummary expectedsummary=new InvoiceSummary(2,30);
		Assertions.assertEquals(expectedsummary, summary);
	}
}