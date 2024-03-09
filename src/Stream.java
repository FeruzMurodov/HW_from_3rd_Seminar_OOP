import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream  implements Iterable<StudyGroup>, Comparable<Stream>{
    String name;
    List<StudyGroup> listOfGroups = new ArrayList<>();

    public Stream(String name, List<StudyGroup> listOfGroups) {
        this.listOfGroups = listOfGroups;
        this.name = name;
    }

    public List<StudyGroup> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<StudyGroup> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Iterator<StudyGroup> iterator() {
        return new StreamIterator(listOfGroups);
    }

    @Override
    public int compareTo(Stream o) {
        return Integer.compare(this.getListOfGroups().size(), o.getListOfGroups().size());
    }

    @Override
    public String toString() {
        return "Поток - " + name  +
                ": " + listOfGroups;
    }
}






