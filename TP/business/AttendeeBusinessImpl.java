package business;

import data.AttendeeDataMock;
import model.Attendee;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AttendeeBusinessImpl implements AttendeeBusiness{

    List<Attendee> attendees = AttendeeDataMock.getList();


    @Override
    public List<Attendee> getList() {
        return attendees;
    }

    @Override
    public Optional<Attendee> getAttendee(String id) {
        Optional<Attendee> attendee = attendees.stream()
                                  .filter(std -> Objects.equals(std.getId(), id))
                                  .findFirst();

        // attendee.isPresent() ? Optional.of(attendee.get().getAttendee()) : Optional.empty();

        return attendee;
    }

    
}
