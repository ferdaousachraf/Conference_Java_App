package data;

import model.Presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PresentationDataMock {

	@SuppressWarnings("deprecation")
	public static List<Presentation> getList() {
		List<Presentation> list = new ArrayList<Presentation>();

		Presentation p1 = new Presentation();

		p1.setTitle("Diversity and ICT Enhanced Education in Context.");
		p1.setStartAt(new Date(2022, 05, 01, 10, 00));
		p1.setEndAt(new Date(2022, 05, 01, 11, 00));
		p1.setDescription("Diversity and ICT Enhanced Education in Context.");

		p1.setRoom(RoomDataMock.getRoom());
		p1.setSpeaker(SpeakerDataMock.getSpeaker());

		p1.setAttendeesList(AttendeeDataMock.getRandomNumberOfAttendees());

		Presentation p2 = new Presentation();

		p2.setTitle("Innovative e-Learning Concepts");
		p2.setStartAt(new Date(2022, 05, 01, 11, 00));
		p2.setEndAt(new Date(2022, 05, 01, 12, 00));
		p2.setDescription("Innovative e-Learning Concepts");

		p2.setRoom(RoomDataMock.getRoom());
		p2.setSpeaker(SpeakerDataMock.getSpeaker());

		p2.setAttendeesList(AttendeeDataMock.getRandomNumberOfAttendees());

		Presentation p3 = new Presentation();

		p3.setTitle("Empowering the Digital Teacher");
		p3.setStartAt(new Date(2022, 05, 01, 14, 30));
		p3.setEndAt(new Date(2022, 05, 01, 15, 30));
		p3.setDescription("Empowering the Digital Teacher");

		p3.setRoom(RoomDataMock.getRoom());
		p3.setSpeaker(SpeakerDataMock.getSpeaker());

		p3.setAttendeesList(AttendeeDataMock.getRandomNumberOfAttendees());

		Presentation p4 = new Presentation();

		p4.setTitle("Empowering the Digital Teacher");
		p4.setStartAt(new Date(2022, 05, 01, 14, 30));
		p4.setEndAt(new Date(2022, 05, 01, 15, 30));
		p4.setDescription("Empowering the Digital Teacher");

		p4.setRoom(RoomDataMock.getRoom());
		p4.setSpeaker(SpeakerDataMock.getSpeaker());

		p4.setAttendeesList(AttendeeDataMock.getRandomNumberOfAttendees());

		return Arrays.asList(p1, p2, p3, p4);

	}

}
