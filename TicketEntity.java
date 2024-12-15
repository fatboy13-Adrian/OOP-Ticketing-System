public class TicketEntity {
    private float totalCost;
    private int noOfSeats;
    private int refreshment;
	private String name;
	private String creditNo;
	private String phoneNo;
	private int[] seatNo;
	
	
public TicketEntity()
{
totalCost = 0;
noOfSeats = 0;
refreshment = 0;
name = null;
creditNo = null;
phoneNo = null;
seatNo = null;

}
public TicketEntity(int noOfSeats, float totalCost, int refreshment, String name, String credit, String phoneNo, int[] seatNo){
	
this.name = name;
creditNo =credit;
this.phoneNo = phoneNo;
this.totalCost= totalCost;
this.refreshment = refreshment;
this.noOfSeats = noOfSeats;
this.seatNo = seatNo;
}
public float getTotalCost() {
	return totalCost;
}
public void setTotalCost(float totalCost) {
	this.totalCost = totalCost;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public int getRefreshment() {
	return refreshment;
}
public void setRefreshment(int refreshment) {
	this.refreshment = refreshment;
}
public void setCreditNo(String creditNo) {
	this.creditNo = creditNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int[] getSeatNo() {
	return seatNo;
}
public void setSeatNo(int[] seatNo) {
	this.seatNo = seatNo;
}

}

