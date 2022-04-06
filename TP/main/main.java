package main;

import java.util.Optional;

import business.ConferenceBusinessImpl;
import helper.Helper;
import model.Conference;

public class main {

	public static void main(String[] args) {
		
		
		ConferenceBusinessImpl conferenceImpl = new ConferenceBusinessImpl();
		
		Optional<Conference> conference = conferenceImpl.getConference("conf1");
		
		
		 Helper.generateJson(conference);
		
		
		
	}

}
