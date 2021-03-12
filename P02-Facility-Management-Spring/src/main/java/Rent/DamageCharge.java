package Rent;

public class DamageCharge extends RentalCosts{
	private int damageCharge;
	private Renter renter;
	
	public DamageCharge (Renter renter) {
		super(renter);
		this.renter = renter;
	}

	public void setCosts(int cost) {
		// TODO Auto-generated method stub
		this.damageCharge = cost;
	}

	@Override
	public void getCosts() {
		// TODO Auto-generated method stub
		String renterIDString = String.valueOf(this.renter.getRenterID());
		String damageChargeString = String.valueOf(this.damageCharge);
		System.out.print("The amount owed in damages for renter with ID of: " + renterIDString + " is: " + damageChargeString+"\n");
	}
	

}
