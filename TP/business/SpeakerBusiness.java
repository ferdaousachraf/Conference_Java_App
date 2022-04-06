package business;

import model.Speaker;

import java.util.List;
import java.util.Optional;

public interface SpeakerBusiness {
    /**
     * Get Speaker by id
     *
     * @param id Speaker identifiant
     * @return Speaker find by id
     */
    Optional<Speaker> getSpeaker(String id);

    /**
     * Get Speakers list
     *
     * @return list of Speakers
     */
    List<Speaker> getList();
    
   
}
