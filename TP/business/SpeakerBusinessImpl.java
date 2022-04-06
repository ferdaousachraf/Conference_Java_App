package business;

import data.SpeakerDataMock;
import model.Speaker;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SpeakerBusinessImpl implements SpeakerBusiness{

    List<Speaker> speakers = SpeakerDataMock.getList();


    @Override
    public List<Speaker> getList() {
        return speakers;
    }

    @Override
    public Optional<Speaker> getSpeaker(String id) {
        Optional<Speaker> speaker = speakers.stream()
                                  .filter(std -> Objects.equals(std.getId(), id))
                                  .findFirst();

        // speaker.isPresent() ? Optional.of(speaker.get().getSpeaker()) : Optional.empty();

        return speaker;
    }

    
}
