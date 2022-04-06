package business;

import model.Room;

import java.util.List;
import java.util.Optional;

public interface RoomBusiness {
    /**
     * Get Room by id
     *
     * @param id Room identifiant
     * @return Room find by id
     */
    Optional<Room> getRoom(int number);

    /**
     * Get Rooms list
     *
     * @return list of Rooms
     */
    List<Room> getList();
    
   
}
