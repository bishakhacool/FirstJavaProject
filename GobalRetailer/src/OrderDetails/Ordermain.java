package OrderDetails;

public class Ordermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*OrderClass order=new OrderClass();
	order.setItemName("Toys");
	order.setItemId("256354anm");
	order.setOrderqty("2");
	order.setItemPrice(5000);
	order.setDeliveryDate("10.08.2018");
	
	System.out.println("Here is the details of the item");
	System.out.println("item name:"+order.getItemName());
	System.out.println("item id:"+order.getItemId());
	System.out.println("orderqty:"+order.getOrderqty());
	System.out.println("item price:"+order.getItemPrice());
	System.out.println("delivery date:"+order.getDeliveryDate());*/
	
	
	OrderClass onlineportal=new OnlineOrderClass("www.flipkart.com");
	onlineportal.setItemName("Box of chocolates");
	onlineportal.setItemPrice(570);
	onlineportal.setOrderqty("5");
	onlineportal.setItemId("5689lkjm");
	onlineportal.setDeliveryDate("05.08.2018");
	System.out.println("this is from online panel");
	System.out.println("item name:"+onlineportal.getItemName());
	System.out.println("item id:"+onlineportal.getItemId());
	System.out.println("orderqty:"+onlineportal.getOrderqty());
	System.out.println("item price:"+onlineportal.getItemPrice());
	System.out.println("delivery date:"+onlineportal.getDeliveryDate());
	System.out.println("taxes:"+onlineportal.getTax());
	
	
	
	
	OrderClass storeportal=new StorePickupClass("manyata");
	storeportal.setItemName("dress");
	storeportal.setItemPrice(770);
	storeportal.setOrderqty("1");
	storeportal.setItemId("4689lkjm");
	storeportal.setDeliveryDate("06.08.2018");
	System.out.println("This belongs for store pickup");
	System.out.println("item name:"+storeportal.getItemName());
	System.out.println("item id:"+storeportal.getItemId());
	System.out.println("orderqty:"+storeportal.getOrderqty());
	System.out.println("item price:"+storeportal.getItemPrice());
	System.out.println("delivery date:"+storeportal.getDeliveryDate());
	System.out.println("taxes:"+storeportal.getTax());
		
	
	
		
		
		
		
		
	}

}
