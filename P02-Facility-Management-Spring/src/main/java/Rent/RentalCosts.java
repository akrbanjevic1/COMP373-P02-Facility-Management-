package Rent;

import Rent.Renter;
public abstract class RentalCosts {
	private Renter renter;
	
	public RentalCosts() {
		
	}
	
	public RentalCosts(Renter renter) {
		this.renter = renter;
	}
	
	abstract void setCosts(int cost);
	abstract void getCosts();
	
	public void setRenter(Renter renter) {
		this.renter = renter;
	}
	
	public Renter getRenter(Renter renter) {
		return this.renter;
	}
}
