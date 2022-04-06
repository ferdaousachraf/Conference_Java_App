package business;

import data.ConferenceDataMock;
import model.Conference;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ConferenceBusinessImpl implements ConferenceBusiness{

    List<Conference> conferences = ConferenceDataMock.getList();


    @Override
    public List<Conference> getList() {
        return conferences;
    }

    @Override
    public Optional<Conference> getConference(String id) {
        Optional<Conference> conference = conferences.stream()
                                  .filter(std -> Objects.equals(std.getId(), id))
                                  .findFirst();

        // conference.isPresent() ? Optional.of(conference.get().getConference()) : Optional.empty();

        return conference;
    }

    
}
