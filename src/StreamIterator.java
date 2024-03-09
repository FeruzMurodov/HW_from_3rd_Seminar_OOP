import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudyGroup> {
    List<StudyGroup> listOfGroup = new ArrayList<>();

    public StreamIterator(List<StudyGroup> listOfGroup) {
        this.listOfGroup = listOfGroup;
    }

    int count = 0;

    @Override
    public boolean hasNext() {
        return count < listOfGroup.size();
    }

    @Override
    public StudyGroup next() {
        return listOfGroup.get(count++);
    }
}
