package OrderDetails ;

public class StorePickupClass extends OrderClass {
	private String storeName;

	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}

	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public double getTax() {
		double storetotaltaxCal=super.getTax(); 
		storetotaltaxCal = storetotaltaxCal+20;
		
		return storetotaltaxCal;

}

	public StorePickupClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StorePickupClass(String storeName) {
		super();
		this.storeName = storeName;
	}
}