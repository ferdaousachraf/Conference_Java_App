package data;

import model.Conference;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.javafaker.Faker;

public class ConferenceDataMock {
	
	private static Faker faker = new Faker();
	
	static List<Conference> list = null;

	
	public static Conference getConference() {
       
        
		Conference conference = new Conference();
    	
    	conference.setLocation(faker.address().buildingNumber() + " " + faker.address().streetAddress() + " "
				+ faker.address().city() + " " + faker.address().country());
    	
    	conference.setStartDate(new Date(2022, 05, 01, 10, 00));
    	conference.setEndDate(new Date(2022, 05, 03, 15, 00));
		
    	conference.setSubject("Digital Transformation And E-Learning");
    	conference.setTitle("Digital Transformation And E-Learning");
        
        
        return conference;
        
    }
    

    public static List<Conference> getList() {
    	
    	if (list == null) {
    		
    		list = new ArrayList<Conference>();
            
            Conference conference ;
            
            for (int i = 1; i <= 4; i++) {
            	
            	conference = new Conference();
            	
            	conference.setId("conf"+i);
            	
            	conference.setLocation(faker.address().buildingNumber() + " " + faker.address().streetAddress() + " "
						+ faker.address().city() + " " + faker.address().country());
            	
            	conference.setStartDate(new Date(2022, 05, 01, 10, 00));
            	conference.setEndDate(new Date(2022, 05, 03, 15, 00));
        		
            	conference.setSubject("Conference "+i+" Subject");
            	conference.setTitle("Conference "+i+" Title.");
            	
            	list.add(conference);

    			
    		}
            
    	}
    	
        
        
        return list;
        
    }

}
