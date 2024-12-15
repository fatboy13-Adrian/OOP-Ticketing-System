/*
 * DataStorage.java
 */
import java.util.Vector;
import java.io.*;

public class TicketingDataStorage {
	
    private Vector vect;
    
    public TicketingDataStorage()
    {
    	vect = new Vector();
    }
    
    // store an booking in Vector (in DataStorage)   
    public void storeTicketEntity(TicketEntity ticket)
    {
    	vect.addElement(ticket);
    }
    
    /*
    public TicketEntity retrieveTicketEntity(String idolName)
    {
    	TicketEntity idol = null;
        for (int i=0; i<vect.size(); i++)
        {
        	idol = (TicketEntity)vect.get(i);
            if (idol.getName() == idolName)
            {
                break;
            }
            idol = null;
        }
        return idol;
    }
    */

    // get all bookings in a Vector (in DataStorage)
    public Vector getAllTicketEntity() {
    	return vect;
    }
    
    public void resetBooking()
    {
    	vect.removeAllElements();
    }
    
    /*
    // remove selected booking by index from Vector (in DataStorage)
	public void removeTicketEntityAtIndex(int selected) {
		vect.remove(selected);		
	}    
	*/
}
