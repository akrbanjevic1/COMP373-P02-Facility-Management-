package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Facility.FacilityGroup;
import Facility.FacilityManager;

class FacilityManagerTest {
	private FacilityManager facilityManager;
	private FacilityGroup testGroup;
	@BeforeEach
	void setUp() throws Exception {
		facilityManager = new FacilityManager("Tom Smith","123 Apple Lane", 139);
		testGroup = new FacilityGroup(15);
		facilityManager.assignGroup(testGroup);
	}
	
	@Test
	void getManagerDetails() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		facilityManager.getManagerDetails();
		String testString = "Name: " + "Tom Smith" + " ManagerID: "+139+ " Address: " + "123 Apple Lane\n";
		assertEquals(testString, outContent.toString(),"Should show manager details of Tom smith, id 139, at 123 apple lane");
	}

	@Test
	void testAssignGroup() {
		int testGroupID = facilityManager.getAssignedGroupID();
		assertEquals(15, testGroupID, "If assignment is successful, the assignedGroupID shouldn't be 0");
	}


	@Test
	void testShowAssignedGroup() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		facilityManager.showAssignedGroup();
		String testString = "The assigned Group to this Manager is " + 15+"\n";
		assertEquals(testString, outContent.toString(), "Should return assigned group of 15 for this specific test.");
	}
	
	@Test
	void testRemoveGroup() {
		
		facilityManager.removeGroup();
		assertEquals(0,facilityManager.getAssignedGroupID(),"Should return an assigned group ID of 0 if successful");
	}

}
