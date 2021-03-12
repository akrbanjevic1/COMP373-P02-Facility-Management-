package Maintenance;

import java.util.ArrayList;
import java.util.HashMap;

public class MaintenanceInfo {
    private int FacilityID; // TODO: This needs to be reflected on the UML
    private HashMap<Integer, Integer> MaintenanceRequestsList; // TODO: This needs to be reflected on the UML
    private HashMap<Integer, String> MaintenanceDescList; // TODO: This needs to be reflected on the UML
    private ArrayList<String> FacilityProblems; // TODO: This needs to be reflected on the UML

    public MaintenanceInfo() {
        this.MaintenanceRequestsList = new HashMap<>();
        this.MaintenanceDescList = new HashMap<>();
        this.FacilityProblems = new ArrayList<>();
    }

    public void setFacilityID(int ID) { this.FacilityID = ID; } // TODO: This needs to be reflected on the UML

    public int getFacilityID() { return this.FacilityID; } // TODO: This needs to be reflected on the UML

    public void makeFacilityMaintRequest(int FacilityID, int RequestID, String description) {
        setFacilityID(FacilityID);

        this.MaintenanceRequestsList.put(FacilityID, RequestID);
        this.MaintenanceDescList.put(RequestID, description);
    }

    public void reportFacilityProblem(String description) {
        FacilityProblems.add(description);
    }


    public int calcProblemRateForFacility() {
        System.out.print("This facility has had " + this.FacilityProblems.size() + "problems so far.\n");

        return FacilityProblems.size();
    }

    public void listMaintRequests() {
        this.MaintenanceRequestsList.forEach((k,v) -> System.out.print("This request is for facility ID#" + k + ", and the maintenance request is ID#" + v + ".\n"));
    }

    public void listMaintenance() {
        this.MaintenanceDescList.forEach((k,v) -> System.out.print("Request ID#" + k + " . Maintenance description: " + v + "\n"));
    }

    public void listFacilityProblems() {
        for (String problem : FacilityProblems)
            System.out.print(problem + "\n");
    }
}
