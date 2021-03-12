package Maintenance;

import Facility.FacilityInfo;

import java.util.HashMap;

public class InspectionInfo {
    private int InspectionInfoID;
    private HashMap<Integer, String> InspectionsList; // TODO: This needs to be reflected on the UML

    public InspectionInfo() {
    	this.InspectionsList = new HashMap<Integer, String>();
    }
    
    public void setInspectionInfoID(int InfoID) { this.InspectionInfoID = InfoID; }

    public int getInspectionInfoID() { return this.InspectionInfoID; }

    // TODO: This needs to be reflected on the UML
    public void addNewInspection(int InfoID, String FacilityName) {
        setInspectionInfoID(InfoID);
        
        this.InspectionsList.put(InfoID, FacilityName);
    }

    public void listInspections() {
        this.InspectionsList.forEach((k,v) -> System.out.print("Inspection ID#" + k + ", Name of facility: " + v + "\n"));
    }
}
