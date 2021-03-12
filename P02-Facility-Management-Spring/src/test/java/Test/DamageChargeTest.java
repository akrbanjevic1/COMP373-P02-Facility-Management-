package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Rent.DamageCharge;
import Rent.Renter;

class DamageChargeTest {

	private DamageCharge damageCharge;
	private Renter renter;
	
	@BeforeEach
	void setUp() throws Exception {
		renter = new Renter();
		renter.setRenterAddress("123 Apple Lane");
		renter.setRenterID(98);
		renter.setRenterName("Bob Axel");
		
		damageCharge = new DamageCharge(renter);
		damageCharge.setCosts(1000);
	}

	@Test
	void testGetCosts() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		damageCharge.getCosts();
		String testString = "The amount owed in damages for renter with ID of: " + renter.getRenterID() + " is: " + 1000+"\n";
		
		assertEquals(testString, outContent.toString(),"Should have damages of 1000");
	}

}
