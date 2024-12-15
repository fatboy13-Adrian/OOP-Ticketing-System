import java.util.Vector;

/*
 * Controller.java
 */


public class Controller
{
    private DataStorage ds;
    private Ticketing ticketing;
    
    public Controller() 
    {
        ds = new DataStorage();
    }
    // create an ticketingFinalist and store in DataStorage
    public void createticketing(int noOfSeats, float totalCost, int refreshment, String name, String credit, String phoneNo)
    {
//    	int votes = Integer.parseInt(v);
    	Ticketing ticketing = new Ticketing();
		ds.storeTicketEntity(ticketing);
    }	
    // retrieve an ticketingFinalist by name from DataStorage
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
    // get all ticketingFinalist in a Vector (from DataStorage) 
    public Vector getAllTicketEntity() {
    	return ds.getAllTicketEntity();
    } 
    // read all ticketingFinalists from file into a Vector (in DataStorage)
    public void readTicketFromFile() {
    	ds.readTicketFromFile();
    }
    // write all ticketingFinalists in Vector (in DataStorage) to file
    public boolean writeFile(){
    	return ds.writeFile();
    }
    // remove selected ticketingFinalist by index from Vector (in DataStorage)
	public void removeTicketEntityAtIndex(int selected) {
		ds.removeTicketEntityAtIndex(selected);
		
	}
}