package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Rent.RentInfo;
import Facility.FacilityInfo;
import Rent.Renter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

class RentInfoTest {
	
	private RentInfo rentInfo;
	private FacilityInfo facility;
	private Renter renter;
	
	@BeforeEach
	void setUp() throws Exception {
		renter = new Renter();
		renter.setRenterAddress("123 Apple Lane");
		renter.setRenterID(98);
		renter.setRenterName("Bob Axel");
		
		rentInfo = new RentInfo();
		rentInfo.setRentInfoID(10);
		rentInfo.setRentMaximum(2);
		rentInfo.setFacility(facility);
		rentInfo.setRenterList();
		rentInfo.addRenter(renter.getRenterID());
		
	}

	@Test
	void testGetTenantList() {
		ArrayList<Integer> testList = rentInfo.getTenantList();
		int firstRenter = testList.get(0);
		assertEquals(98, firstRenter, "Should return 98 since test renter has that ID value");
	}

	@Test
	void testListActualUsage() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		rentInfo.listActualUsage();
		String testString = "Currently, there are: " + 1.0 + " renters. The maximum is: " + 2 + " renters."+"\n";
		
		assertEquals(testString, outContent.toString(),"Should match testring");
	}

	@Test
	void testCalcUsageRate() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		rentInfo.calcUsageRate();
		String testString = "The actual usage rate is: " + 0.5+"\n";
		
		assertEquals(testString, outContent.toString(),"Should be 0.5 since there is only 1 for this test");
	}
	
	@Test
	void testRemoveRenter() {
		rentInfo.removeRenter(renter.getRenterID());
		assertEquals(true, rentInfo.getTenantList().isEmpty(),"After removal of sole renter, the list of renters should be 0");
	}


}
