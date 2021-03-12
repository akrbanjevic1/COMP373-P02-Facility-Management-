package Facility;

import java.util.HashMap;
import Facility.FacilityInfo;

public class FacilityGroup {
	private int GroupID;
	private HashMap<Integer, String> FacilitiesList;
	private int GroupCapacity;
	
	public FacilityGroup () {
		//this.GroupID = GroupID;
		//FacilitiesList = new HashMap<>();
	}
	public FacilityGroup(int GroupID) {
		this.GroupID = GroupID;
		FacilitiesList = new HashMap<>();
	}
	public void setGroupID(int id) {
		this.GroupID = id;
	}
	
	public void setFacilitiesList(HashMap<Integer, String> testMap) {
		this.FacilitiesList = testMap;
	}
	
	public void setGroupCapacity(int capacity) {
		this.GroupCapacity = capacity;
	}
	
	public int getGroupID() {
		return this.GroupID;
	}
	
	public HashMap<Integer, String> getFacilitiesList() {
		return this.FacilitiesList;
	}
	
	public int getGroupCapacity() {
		return this.GroupCapacity;
	}
	
	public void addNewFacility(FacilityInfo facilityInfo) {
		int FacilityInfoID = facilityInfo.getFacilityID();
		String FacilityName = facilityInfo.getName();
		this.FacilitiesList.put(FacilityInfoID,FacilityName);
		this.GroupCapacity += 1;
	}
	
	public void removeFacility(FacilityInfo facilityInfo) {
		int FacilityInfoID = facilityInfo.getFacilityID();
		this.FacilitiesList.remove(FacilityInfoID);
		this.GroupCapacity -= 1;
	}
	
	public void listFacilities() {
		this.FacilitiesList.forEach((k,v) -> System.out.print("ID = "
                + k + ", Name of Facility = " + v+"\n")); 
	}
	
	public void requestCapacity() {
		System.out.print("Current capacity of the group is: " + GroupCapacity+"\n");
	}
}
