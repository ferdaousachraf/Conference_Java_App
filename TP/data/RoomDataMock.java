package data;

import model.Room;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class RoomDataMock {
	
	private static Faker faker = new Faker();
	
	static List<Room> list = null;

	
	public static Room getRoom() {
       
        
		if (list == null) 
			getList();
        
        
        return list.get(DataTools.randomIntBetween(1, list.size()));
        
    }
    

    public static List<Room> getList() {
    	
    	if (list == null) {
    		
    		list = new ArrayList<Room>();
            
            Room room ;
            
            for (int i = 1; i <= 6; i++) {
            	
            	room = new Room();
            	
            	room.setName("Room "+i);
            	
            	room.setNumber(i);
            	
            	room.setCapacity(DataTools.randomIntBetween(40, 200));
            	
            	list.add(room);

    			
    		}
            
    	}
    	
        
        
        return list;
        
    }

}
