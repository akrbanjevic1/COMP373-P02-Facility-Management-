package View;

import Facility.FacilityInfo;
import Facility.FacilityManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Facility.FacilityGroup;
import Maintenance.InspectionInfo;
import Maintenance.MaintenanceInfo;
import Maintenance.MaintenanceReq;
import Rent.RentInfo;
import Rent.Renter;
import Rent.RentalCosts;
import Rent.DamageCharge;
import Rent.RentCharge;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		
		FacilityInfo TestFacility = (FacilityInfo) context.getBean("FacilityInfo");
		
		//-------------------------OLD CODE----------------------------
		//FacilityInfo TestFacility = new FacilityInfo();
		//TestFacility.addFacilityDetail("Atwood Apartments", "123 Apple Ave Illinois", 01);
		//TestFacility.getFacilityInfo();
		
		FacilityGroup TestGroup = (FacilityGroup) context.getBean("FacilityGroup");
		TestGroup.listFacilities();
		//--------------------------OLD CODE--------------------------
		//Testing the adding of facility to group and removal of facility
		//FacilityGroup TestGroup = new FacilityGroup(01);
		//TestGroup.addNewFacility(TestFacility);
		//TestGroup.listFacilities();
		//TestGroup.removeFacility(TestFacility);
		//TestGroup.listFacilities();
		//TestGroup.requestCapacity();
		
		FacilityManager TestManager = (FacilityManager) context.getBean("FacilityManager");
		//-------------------------OLD  CODE---------------------------
		//Testing Manager of FacilityGroup features
		//FacilityManager TestManager = new FacilityManager("John Smith", "456 Pear Boulevard", 1335);
		TestManager.assignGroup(TestGroup);
		TestManager.showAssignedGroup();
		TestManager.removeGroup(); //testing to see if the manager had their assigned group removed here.
		TestManager.showAssignedGroup();
		TestManager.getManagerDetails();
		
		//Test Renter Object Here
		System.out.println("-----------------------------------------Testing of Rent related Objects starts here---------------------------------------");
		//Renter testRenter = new Renter();
		Renter testRenter = (Renter) context.getBean("Renter");
		//testRenter.setRenterID(93);
		//testRenter.setRenterAddress("1378 Pearl Ave, London UK");
		//testRenter.setRenterName("Tom Smith");
		int testRenterID = testRenter.getRenterID();
		//Making another renter to test the Maximum function of RentInfo
		Renter testRenter2 = new Renter();
		testRenter2.setRenterID(92);
		testRenter2.setRenterAddress("098 I dont know Ave");
		testRenter2.setRenterName("Bob Smith");
		int testRenterID2 = testRenter2.getRenterID();
		
		//Test RentInfo Object here
		RentInfo testRentInfo = (RentInfo) context.getBean("RentInfo");
		//RentInfo testRentInfo = new RentInfo();
		//testRentInfo.setFacility(TestFacility);
		testRentInfo.setRenterList();
		//testRentInfo.setRentInfoID(1392);
		//testRentInfo.setRentMaximum(2);
		
		testRentInfo.addRenter(testRenterID);
		testRentInfo.addRenter(testRenterID2);
		testRentInfo.listActualUsage();
		testRentInfo.calcUsageRate();
		testRentInfo.removeRenter(testRenterID);
		testRentInfo.listActualUsage();
		testRentInfo.calcUsageRate();
		
		System.out.println("-----------------------------------------Testing of Costs starts here---------------------------------------");
		//Testing rental costs here.
		//----------------------------------------------------------------- Next thing to configure with Spring
		//RentCharge testRentCharge = new RentCharge(testRenter);
		//testRentCharge.setCosts(1800);
		
		RentCharge testRentCharge = (RentCharge) context.getBean("RentCharge");
		testRentCharge.getCosts();
		
		//DamageCharge testDamageCharge = new DamageCharge(testRenter);
		//testDamageCharge.setCosts(4000);
		
		DamageCharge testDamageCharge = (DamageCharge) context.getBean("DamageCharge");
		testDamageCharge.getCosts();

		System.out.println("-----------------------------------------Testing of Maintenance package starts here---------------------------------------");

		// Testing maintenance related requests
		MaintenanceReq testMaintReq = new MaintenanceReq();

		testMaintReq.scheduleMaintenance(1, "04/21/2021", "Fixing broken smoke detectors.");
		testMaintReq.calcMaintenanceCost(2.3);
		testMaintReq.performMaintenance(1);

		// Testing inspection related requests
		InspectionInfo testInspecInfo = new InspectionInfo();

		testInspecInfo.setInspectionInfoID(302);
		testInspecInfo.addNewInspection(302, "Skokie Location");
		
		testInspecInfo.setInspectionInfoID(313);
		testInspecInfo.addNewInspection(313, "Evanston Location");

		testInspecInfo.listInspections();
	}

}
