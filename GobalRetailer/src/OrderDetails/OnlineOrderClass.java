/**
 * 
 */
package OrderDetails ;

/**
 * @author Bishakha
 *
 */
public class OnlineOrderClass extends OrderClass {
	private String onlinePortalname;
	

	public OnlineOrderClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnlineOrderClass(String onlinePortalname) {
		super();
		this.onlinePortalname = onlinePortalname;
	}

	/**
	 * @return the onlinePortalname
	 */
	public String getOnlinePortalname() {
		return onlinePortalname;
	}

	/**
	 * @param onlinePortalname the onlinePortalname to set
	 */
	public void setOnlinePortalname(String onlinePortalname) {
		this.onlinePortalname = onlinePortalname;
	}
	public double getTax() {
		double totaltaxCal=super.getTax(); 
		totaltaxCal = totaltaxCal+100;
		return totaltaxCal;
		
		
}
}