package Test;

import Maintenance.MaintenanceInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceInfoTest {
    MaintenanceInfo maintenanceInfoObject = new MaintenanceInfo();

    @BeforeEach
    public void setUp() throws Exception {
        maintenanceInfoObject.setFacilityID(302);
        maintenanceInfoObject.makeFacilityMaintRequest(302, 3, "Front lobby camera is not working.");
        maintenanceInfoObject.reportFacilityProblem("Men's bathroom is out of order.");
    }

    @Test
    void testGettingID() { assertEquals(302, maintenanceInfoObject.getFacilityID()); }

    @Test
    void testAddingNewMaintRequest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        maintenanceInfoObject.listMaintRequests();

        String testString = "This request is for facility ID#" + 302 + ", and the maintenance request is ID#" + 3 +".\n";
        assertEquals(testString, outContent.toString(),"Should have a facility ID# of '302' and maintenance request ID# of '3'.");
    }

    @Test
    void testListingMaintenance() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        maintenanceInfoObject.listMaintenance();

        String testString2 = "Request ID#" + 3 + " . Maintenance description: " + "Front lobby camera is not working.\n";
        assertEquals(testString2, outContent.toString(), "Should have a request ID# of '3' and a description of 'Front lobby camera is not working.");
    }

    @Test
    void testCalculatingProbRateForFacility() { assertEquals(1, maintenanceInfoObject.calcProblemRateForFacility()); }

    @Test
    void testListingFacilityProblems() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        maintenanceInfoObject.listFacilityProblems();

        String testString = "Men's bathroom is out of order.\n";
        assertEquals(testString, outContent.toString(), "Should return with 'Men's bathroom is out of order.");
    }
}
