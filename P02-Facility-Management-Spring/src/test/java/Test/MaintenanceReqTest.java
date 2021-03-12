package Test;

import Maintenance.MaintenanceReq;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceReqTest {
    MaintenanceReq maintenanceReqObject = new MaintenanceReq();

    @BeforeEach
    public void setUp() throws Exception {
        maintenanceReqObject.setRequestID(18);
        maintenanceReqObject.setHoursWorked(3.4);
    }

    @Test
    void testGettingID() { assertEquals(18, maintenanceReqObject.getRequestID()); }

    @Test
    void testGettingHoursWorked() { assertEquals(3.4, maintenanceReqObject.getHoursWorked().doubleValue());}

    @Test
    void testCalculatingMaintCost() { assertEquals(211.05, maintenanceReqObject.calcMaintenanceCost(4.2).doubleValue()); }
}
