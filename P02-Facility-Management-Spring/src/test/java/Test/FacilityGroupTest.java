package Test;
import Facility.FacilityGroup;
import Facility.FacilityInfo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacilityGroupTest {
	private FacilityGroup facilityGroup;
	private FacilityInfo facilityInfo;
	
	@BeforeEach
	public void setUp() throws Exception {
		facilityGroup = new FacilityGroup(15);
		//Setting up a facility info here to pre-add to group.
		facilityInfo = new FacilityInfo();
		facilityInfo.addFacilityDetail("Kensington", "112 Apple Lane", 35);
		
		facilityGroup.addNewFacility(facilityInfo);
	}

	@Test
	void testGetGroupID() {
		assertEquals(15, facilityGroup.getGroupID(),"Should get prev. defined ID of 15");
	}

	@Test
	void testListFacilities() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		facilityGroup.listFacilities();
		String testString = "ID = " + 35 + ", Name of Facility = " + "Kensington\n";
		assertEquals(testString, outContent.toString(),"Should show info for the 1 facility");
	}

	@Test
	void testRequestCapacity() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		facilityGroup.requestCapacity();
		String testString = "Current capacity of the group is: "+1+"\n";
		assertEquals(testString, outContent.toString(),"Should return capacity of 1 since we added only 1 group");
	}
	
	
}
