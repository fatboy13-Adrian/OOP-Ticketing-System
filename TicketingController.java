import java.util.Vector;

/*
 * Controller.java
 */


public class TicketingController
{
    private TicketingDataStorage ds;
    private TicketEntity ticketing;
    
    public TicketingController() 
    {
        ds = new TicketingDataStorage();
    }
    // create an ticketingFinalist and store in DataStorage
    public void createticketing(int noOfSeats, float totalCost, int refreshment, String name, String credit, String phoneNo, int[] seatNo)
    {
//    	int votes = Integer.parseInt(v);
    	TicketEntity ticketing = new TicketEntity(noOfSeats,  totalCost, refreshment, name, credit, phoneNo, seatNo);
		ds.storeTicketEntity(ticketing);
    }	
    // retrieve an ticketingFinalist by name from DataStorage
    /*
    public boolean retrieveTicketEntity(String ticketingName)
    {
    	
    	ticketing = ds.retrieveTicketEntity(ticketingName);
        if (ticketing == null)
        {
        	return false;
        }
        else
        {
        	return true;
        }
    }	
    */
    // get all ticketingFinalist in a Vector (from DataStorage) 
    public Vector getAllTicketEntity() {
    	return ds.getAllTicketEntity();
    } 

    public void resetBooking()
    {
    	ds.resetBooking();
    }
}
