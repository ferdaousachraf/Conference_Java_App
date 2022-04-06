package data;

import model.Review;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.javafaker.Faker;

import enums.ReviewTypeEnum;

public class ReviewDataMock {
	
	private static Faker faker = new Faker();
	
	static List<Review> list = null;

	
	public static Review getReview() {
       
        
		if (list == null) 
			getList();
        
        
        return list.get(DataTools.randomIntBetween(1, list.size()));
        
    }
    

    public static List<Review> getList() {
    	
    	if (list == null) {
    		
    		list = new ArrayList<Review>();
            
            Review review ;
            
            for (int i = 1; i <= 20; i++) {
            	
            	review = new Review();
            	
            	review.setReviewText("a Review N "+i+" about a Presentation ");
            	
            	review.setReviewDate(DataTools.randomDateBetween(new Date(2022, 05, 01, 10, 00), new Date(2022, 05, 30, 23, 00)));
            	
            	review.setReviewer(AttendeeDataMock.getAttendee());
            	
            	review.setReviewType(ReviewTypeEnum.values()[DataTools.randomIntBetween(0, 5)]);
            	
            	list.add(review);

    			
    		}
            
    	}
    	
        
        
        return list;
        
    }

}
