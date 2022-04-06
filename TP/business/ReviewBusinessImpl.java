package business;

import data.ReviewDataMock;
import model.Review;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ReviewBusinessImpl implements ReviewBusiness{

    List<Review> reviews = ReviewDataMock.getList();


    @Override
    public List<Review> getList() {
        return reviews;
    }

    @Override
    public Optional<Review> getReview(String id) {
        Optional<Review> review = reviews.stream()
                                  .filter(std -> Objects.equals(std.getId(), id))
                                  .findFirst();

        // review.isPresent() ? Optional.of(review.get().getReview()) : Optional.empty();

        return review;
    }

    
}
