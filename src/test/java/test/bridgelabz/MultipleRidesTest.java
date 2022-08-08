package test.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultipleRidesTest {

	@Test
	public void givenMultipleRidesShouldReturnTotalFare() {
		MultipleRides multipleride=new MultipleRides();
		Ride[] rides= {new Ride(2.0,5),
			new Ride(0.1,1)	
		};
		double fare=multipleride.calculateFare(rides);
		Assertions.assertEquals(30, fare);
	}

}
