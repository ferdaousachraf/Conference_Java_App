package data;

import enums.SexTypeEnum;
import model.Attendee;
import model.Speaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.github.javafaker.Faker;

public class AttendeeDataMock {

	private static Faker faker = new Faker();

	static List<Attendee> list = null;

	public static List<Attendee> getList() {

		if (list == null) {

			list = new ArrayList<Attendee>();

			Attendee att;

			for (int i = 1; i <= 100; i++) {

				att = new Attendee();

				att.setId(faker.code().gtin13());

				att.setFirstName(faker.name().firstName());

				att.setLastName(faker.name().lastName());

				if (i % 2 == 0)
					att.setSex(SexTypeEnum.FEMALE);
				else
					att.setSex(SexTypeEnum.MALE);

				att.setAdress(faker.address().buildingNumber() + " " + faker.address().streetAddress() + " "
						+ faker.address().city() + " " + faker.address().country());

				att.setCardID(faker.idNumber().toString());

				att.setPhoneNumber(faker.phoneNumber().cellPhone());

				att.setProfession(faker.job().title());

				att.setRegistrationDate(DataTools.randomDateBetween(new Date(2022, 04, 01), new Date(2022, 04, 30)));

				list.add(att);

			}
		}

		return list;

	}

	public static Attendee getAttendee() {
		if (list == null)
			getList();
		return list.get(DataTools.randomIntBetween(1, list.size()));
	}

	public static List<Attendee> getRandomNumberOfAttendees() {

		if (list == null)
			getList();

		int start = DataTools.randomIntBetween(0, list.size());

		int end = DataTools.randomIntBetween(start, list.size());

		return list.subList(start, end);

	}

}
