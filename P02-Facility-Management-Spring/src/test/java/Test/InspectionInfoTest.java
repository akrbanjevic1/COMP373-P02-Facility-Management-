package Test;

import Maintenance.InspectionInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InspectionInfoTest {
    InspectionInfo inspectionInfoObject = new InspectionInfo();

    @BeforeEach
    public void setUp() throws Exception {
        inspectionInfoObject.addNewInspection(3, "Bloomington Location");
    }

    @Test
    void testGetInspectionID() { assertEquals(3, inspectionInfoObject.getInspectionInfoID()); }

    @Test
    void testAddingNewInspection() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        inspectionInfoObject.listInspections();

        String testString = "Inspection ID#" + 3 + ", Name of facility: " + "Bloomington Location\n";
        assertEquals(testString, outContent.toString(),"Should have an inspection ID# of '3' and location of 'Bloomington Location'.");
    }
}
