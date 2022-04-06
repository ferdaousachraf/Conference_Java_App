package business;

import model.Attendee;

import java.util.List;
import java.util.Optional;

public interface AttendeeBusiness {
    /**
     * Get Attendee by id
     *
     * @param id Attendee identifiant
     * @return Attendee find by id
     */
    Optional<Attendee> getAttendee(String id);

    /**
     * Get Attendees list
     *
     * @return list of Attendees
     */
    List<Attendee> getList();
    
   
}
