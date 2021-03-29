package Maintenance;

import java.util.HashMap;

public class InspectionInfo {
    private int InspectionInfoID;
    private String FacilityName;
    private HashMap<Integer, String> InspectionsList;

    /* OLD CODE
     
    public InspectionInfo() {
    	this.InspectionsList = new HashMap<Integer, String>(); OLD CODE
    }
    
    */
    
    public void setInspectionInfoID(int InfoID) { this.InspectionInfoID = InfoID; }
    
    public void setFacilityName(String name) { this.FacilityName = name; }
    
    public void setInspectionsList(HashMap<Integer, String> hashMap) { this.InspectionsList = hashMap; }

    public int getInspectionInfoID() { return this.InspectionInfoID; }
    
    public String getFacilityName() { return this.FacilityName; }
    
    public HashMap<Integer, String> getInspectionsList() { return this.InspectionsList; }

    public void addNewInspection(int InfoID, String FacilityName) {
        setInspectionInfoID(InfoID);
        
        this.InspectionsList.put(InfoID, FacilityName);
    }

    public void listInspections() {
        this.InspectionsList.forEach((k,v) -> System.out.print("Inspection ID#" + k + ", Name of facility: " + v + "\n"));
    }
}
