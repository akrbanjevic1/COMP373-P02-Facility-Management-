package Rent;

public class RentCharge extends RentalCosts{
	private int rentCharge;
	private Renter renter;
	
	public RentCharge(Renter renter) {
		super(renter);
		this.renter = renter;
	}

	public void setCosts(int cost) {
		// TODO Auto-generated method stub
		this.rentCharge = cost;
	}

	@Override
	public void getCosts() {
		// TODO Auto-generated method stub
		String renterIDString = String.valueOf(this.renter.getRenterID());
		String rentChargeString = String.valueOf(this.rentCharge);
		System.out.print("The amount owed in rent for renter with ID of: " + renterIDString + " is: " + rentChargeString+"\n");
	}
	
	

}
