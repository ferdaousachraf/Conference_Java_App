package business;

import model.Presentation;

import java.util.List;
import java.util.Optional;

public interface PresentationBusiness {
    /**
     * Get Presentation by id
     *
     * @param id Presentation identifiant
     * @return Presentation find by id
     */
    Optional<Presentation> getPresentation(String id);

    /**
     * Get Presentations list
     *
     * @return list of Presentations
     */
    List<Presentation> getList();
    
   
}
