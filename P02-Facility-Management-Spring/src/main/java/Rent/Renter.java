package Rent;

public class Renter {
	private String renterAddress;
	private String renterName;
	private int renterID;
	
	public void setRenterID(int renterID) {
		this.renterID = renterID;
	}
	
	public void setRenterName(String name) {
		this.renterName = name;
	}
	
	public void setRenterAddress(String address) {
		this.renterAddress = address;
	}
	
	public int getRenterID() {
		return this.renterID;
	}
	
	public String getRenterName() {
		return this.renterName;
	}
	
	public String getAddress() {
		return this.renterAddress;
	}
	
}
