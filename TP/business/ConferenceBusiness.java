package business;

import model.Conference;

import java.util.List;
import java.util.Optional;

public interface ConferenceBusiness {
    /**
     * Get Conference by id
     *
     * @param id Conference identifiant
     * @return Conference find by id
     */
    Optional<Conference> getConference(String id);

    /**
     * Get Conferences list
     *
     * @return list of Conferences
     */
    List<Conference> getList();
    
   
}
