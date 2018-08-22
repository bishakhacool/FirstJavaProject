package OrderDetails;

public class OrderClass {
private String orderqty;
private String itemName;
private String itemId;
private int itemPrice ;
private String DeliveryDate;
/**
 * @return the orderqty
 */
public String getOrderqty() {
	return orderqty;
}
/**
 * @return the itemPrice
 */
public int getItemPrice() {
	return itemPrice;
}
/**
 * @param itemPrice the itemPrice to set
 */
public void setItemPrice(int itemPrice) {
	this.itemPrice = itemPrice;
}
/**
 * @return the deliveryDate
 */
public String getDeliveryDate() {
	return DeliveryDate;
}
/**
 * @param deliveryDate the deliveryDate to set
 */
public void setDeliveryDate(String deliveryDate) {
	DeliveryDate = deliveryDate;
}
/**
 * @param orderqty the orderqty to set
 */
public void setOrderqty(String orderqty) {
	this.orderqty = orderqty;
}
/**
 * @return the itemName
 */
public String getItemName() {
	return itemName;
}
/**
 * @param itemName the itemName to set
 */
public void setItemName(String itemName) {
	this.itemName = itemName;
}
/**
 * @return the itemId
 */
public String getItemId() {
	return itemId;
}
/**
 * @param itemId the itemId to set
 */
public void setItemId(String itemId) {
	this.itemId = itemId;
}





public double getTax() {
	double taxCal = (this.itemPrice*0.05);
	return taxCal;
	
	
	
	
}

}
