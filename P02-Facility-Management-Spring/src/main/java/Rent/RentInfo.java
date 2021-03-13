package Rent;

import Facility.FacilityInfo;
import java.util.*;

public class RentInfo {
	private int rentInfoID;
	private double actualUsage = 0;
	private FacilityInfo facilityInfo;
	private int rentMaximum; //this would be for the maximum amount of people allowed to rent the facility.
	private ArrayList<Integer> tenantList;
	
	public RentInfo() {
		
	}
	//Setters for instance variables
	public void setRentInfoID(int ID) {
		this.rentInfoID = ID;
	}
	
	public void setFacilityInfo(FacilityInfo facility) {
		this.facilityInfo = facility;
	}
	
	public void setRentMaximum(int max) {
		this.rentMaximum = max;
	}
	
	public void setRenterList() {
		this.tenantList = new ArrayList<Integer>();
	}
	
	//Getters for instance variables
	public int getRentInfoID() {
		return this.rentInfoID;
	}
	
	public FacilityInfo getFacilityInfo() {
		return this.facilityInfo;
	}
	
	public int getRentMaximum() {
		return this.rentMaximum;
	}
	
	public ArrayList<Integer> getTenantList() {
		return this.tenantList;
	}
	
	//Here begin the adding and removing methods (for renters of a facility).
	public void addRenter(int renterID) {
		Integer renterIDInteger = Integer.valueOf(renterID);
		double actualUsagePlusOne = this.actualUsage + 1;
		
		if(!tenantList.contains(renterIDInteger) && ((actualUsagePlusOne) <= rentMaximum)) {
			tenantList.add(renterIDInteger);
			actualUsage++;
		}
		else {
			System.out.println("Sorry, the renter is already in the list of known tenants OR the maximum of " + rentMaximum + " has been reached");
		}
	}
	
	public void removeRenter(int renterID) {
		Integer renterIDInteger = Integer.valueOf(renterID);
		
		if(tenantList.contains(renterIDInteger)) {
			tenantList.remove(Integer.valueOf(renterID));
			actualUsage--;
		}
		
		else {
			System.out.println("An error has occurred; maybe the renter hasn't been added to the list?");
		}
	}
	
	public void listActualUsage() {
		System.out.print("Currently, there are: " + actualUsage + " renters. The maximum is: " + rentMaximum + " renters."+"\n");
	}
	
	public void calcUsageRate() {
		Double usageRate = (actualUsage / rentMaximum);
		System.out.print("The actual usage rate is: " + usageRate+"\n");
	}
	
}
