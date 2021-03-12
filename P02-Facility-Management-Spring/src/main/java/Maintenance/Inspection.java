package Maintenance;

public class Inspection {
    private int InspectionID;
    private String InspectionStatus;

    public void setInspectionID(int ID) { this.InspectionID = ID; }

    public void setInspectionStatus(String status) { this.InspectionStatus = status; }

    public int getInspectionID() { return this.InspectionID; }

    public String getInspectionStatus() { return this.InspectionStatus; }
}
