/*
 * DataStorage.java
 */
import java.util.Vector;
import java.io.*;

public class DataStorage {
	private String storageFile = "idolFinalists.DAT";  //external file
	
    private Vector idolVect; 
    
    public DataStorage()
    {
    	idolVect = new Vector();
    }
    // store an IdolFinalist in Vector (in DataStorage)   
    public void storeTicketEntity(Ticketing anIdol)
    {
    	idolVect.addElement(anIdol);
    }
    // retrieve an IdolFinalist by name from Vector (in DataStorage)
    public Ticketing retrieveTicketEntity(String idolName)
    {
    	Ticketing idol = null;
        for (int i=0; i<idolVect.size(); i++)
        {
        	idol = (Ticketing)idolVect.get(i);
            if (idol.getName() == idolName)
            {
                break;
            }
            idol = null;
        }
        return idol;
    }

    // write all IdolFinalists in Vector (in DataStorage) to file
    public boolean writeFile(){ //Write vector to file
		boolean success = false;
		if(idolVect !=null){
				try{
					ObjectOutputStream ss = new ObjectOutputStream(new FileOutputStream(storageFile));
					ss.writeObject(idolVect);
					ss.flush();
					ss.close();
					success = true;
				}
				catch(IOException io){
					System.err.println("Error in reading object " + io.getMessage());
					success = false;
				}
		
		}
		else{
			System.err.println("List empty");
			success = false;
		}
		return success;
	}
    // read all IdolFinalists from file into a Vector (in DataStorage)
    public void readTicketFromFile() {
		//Read from data file and store in vector
		int count=0;
		boolean noError=false;
		ObjectInputStream ss=null;
		try{
			ss = new ObjectInputStream(new FileInputStream(storageFile));
			noError=true;
		}
		catch(IOException io){
			System.out.println("Error in reading object list file" + io.getMessage());
			noError=false;
		}
		if(noError){
			try{
				idolVect = (Vector) ss.readObject();
				ss.close();
				noError =true;
			}
			catch(Exception e){
				System.err.println("Error in reading object " + e.getMessage());
				noError = false;
			}
		}
//		if(noError) return idolVect;	
//		else return null;
    }
    // get all IdolFinalist in a Vector (in DataStorage)
    public Vector getAllTicketEntity() {
    	return idolVect;
    }
    // remove selected IdolFinalist by index from Vector (in DataStorage)
	public void removeTicketEntityAtIndex(int selected) {
		idolVect.remove(selected);		
	}    
}