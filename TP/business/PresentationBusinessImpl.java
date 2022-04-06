package business;

import data.PresentationDataMock;
import model.Presentation;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PresentationBusinessImpl implements PresentationBusiness{

    List<Presentation> presentations = PresentationDataMock.getList();


    @Override
    public List<Presentation> getList() {
        return presentations;
    }

    @Override
    public Optional<Presentation> getPresentation(String id) {
        Optional<Presentation> presentation = presentations.stream()
                                  .filter(std -> Objects.equals(std.getId(), id))
                                  .findFirst();

        // presentation.isPresent() ? Optional.of(presentation.get().getPresentation()) : Optional.empty();

        return presentation;
    }

    
}
