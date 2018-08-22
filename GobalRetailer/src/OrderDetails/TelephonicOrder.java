package OrderDetails;

public class TelephonicOrder extends OrderClass {

private String customerContactNo = "9742192304";


 
	public TelephonicOrder() {
	super();
	// TODO Auto-generated constructor stub
}


	public TelephonicOrder(String customerContactNo) {
	super();
	this.customerContactNo = customerContactNo;
}


	public String getCustomerContactNo() {
	return customerContactNo;
}


public void setCustomerContactNo(String customerContactNo) {
	this.customerContactNo = customerContactNo;
}


	@Override
	public double getTax() {
		double teleTax=super.getTax()+30;
		return teleTax ;
	}

	
}
