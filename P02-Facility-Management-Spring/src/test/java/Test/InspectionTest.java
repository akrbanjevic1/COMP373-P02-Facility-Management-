package Test;

import Maintenance.Inspection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InspectionTest {
    Inspection inspectionObject = new Inspection();

    @BeforeEach
    public void setUp() throws Exception {
        inspectionObject.setInspectionID(5);
        inspectionObject.setInspectionStatus("Under inspection.");
    }

    @Test
    void testGettingID() { assertEquals(5, inspectionObject.getInspectionID()); }

    @Test
    void testGettingStatus() { assertEquals("Under inspection.", inspectionObject.getInspectionStatus()); }
}
