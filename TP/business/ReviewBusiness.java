package business;

import model.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewBusiness {
    /**
     * Get Review by id
     *
     * @param id Review identifiant
     * @return Review find by id
     */
    Optional<Review> getReview(String id);

    /**
     * Get Reviews list
     *
     * @return list of Reviews
     */
    List<Review> getList();
    
   
}
