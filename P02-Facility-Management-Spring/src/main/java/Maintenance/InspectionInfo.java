package Maintenance;

import Facility.FacilityInfo;

import java.util.HashMap;

public class InspectionInfo {
    private int InspectionInfoID;
    private HashMap<Integer, String> InspectionsList;

//    public InspectionInfo() {
//    	// this.InspectionsList = new HashMap<Integer, String>(); OLD CODE
//    }
    
//    public InspectionInfo(int InfoID) {
//    	this.InspectionInfoID = InfoID;
//    	InspectionsList = new HashMap<Integer, String>();
//    }
    
    public void setInspectionInfoID(int InfoID) { this.InspectionInfoID = InfoID; }
    
    public void setInspectionsList(HashMap<Integer, String> hashMap) { this.InspectionsList = hashMap; }

    public int getInspectionInfoID() { return this.InspectionInfoID; }
    
    public HashMap<Integer, String> getInspectionsList() { return this.InspectionsList; }

    public void addNewInspection(int InfoID, String FacilityName) {
        setInspectionInfoID(InfoID);
        
        this.InspectionsList.put(InfoID, FacilityName);
    }

    public void listInspections() {
        this.InspectionsList.forEach((k,v) -> System.out.print("Inspection ID#" + k + ", Name of facility: " + v + "\n"));
    }
}
