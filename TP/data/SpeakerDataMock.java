package data;

import enums.SexTypeEnum;
import model.Speaker;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class SpeakerDataMock {

	private static Faker faker = new Faker();

	static List<Speaker> list = null;

	public static List<Speaker> getList() {

		if (list == null) {

			list = new ArrayList<Speaker>();

			Speaker sp;

		

			for (int i = 1; i <= 10; i++) {

				sp = new Speaker();

				sp.setId(faker.code().gtin13());

				sp.setFirstName(faker.name().firstName());

				sp.setLastName(faker.name().lastName());

				if (i % 2 == 0)
					sp.setSex(SexTypeEnum.FEMALE);
				else
					sp.setSex(SexTypeEnum.MALE);

				sp.setAdress(faker.address().buildingNumber() + " " + faker.address().streetAddress() + " "
						+ faker.address().city() + " " + faker.address().country());

				sp.setCardID(faker.idNumber().toString());

				sp.setPhoneNumber(faker.phoneNumber().cellPhone());

				sp.setProfession(faker.job().title());

				sp.setIndemnity(DataTools.randomIntBetween(1500, 5000));

				sp.setSpeakerTitle(faker.job().title());

				list.add(sp);

			}
		}
		return list;

	}

	public static Speaker getSpeaker() {
		if (list == null) 
			getList();
        return list.get(DataTools.randomIntBetween(1, list.size()));
	}

}
