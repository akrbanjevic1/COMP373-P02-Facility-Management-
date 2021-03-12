package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import Rent.Renter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Rent.RentCharge;
class RentChargeTest {
	private RentCharge rentCharge;
	private Renter renter;
	
	@BeforeEach
	void setUp() throws Exception {
		renter = new Renter();
		renter.setRenterAddress("123 Apple Lane");
		renter.setRenterID(98);
		renter.setRenterName("Bob Axel");
		
		rentCharge = new RentCharge(renter);
		rentCharge.setCosts(1000);
	}

	@Test
	void testGetCosts() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		rentCharge.getCosts();
		String testString = "The amount owed in rent for renter with ID of: " + renter.getRenterID() + " is: " + 1000+"\n";
		
		assertEquals(testString, outContent.toString(),"Should have rent of 1000");
	}

}
