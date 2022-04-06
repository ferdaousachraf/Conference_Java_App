package business;

import data.RoomDataMock;
import model.Room;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class RoomBusinessImpl implements RoomBusiness{

    List<Room> rooms = RoomDataMock.getList();


    @Override
    public List<Room> getList() {
        return rooms;
    }

    @Override
    public Optional<Room> getRoom(int number) {
        Optional<Room> room = rooms.stream()
                                  .filter(std -> Objects.equals(std.getNumber(), number))
                                  .findFirst();

        // room.isPresent() ? Optional.of(room.get().getRoom()) : Optional.empty();

        return room;
    }

	

    
}
