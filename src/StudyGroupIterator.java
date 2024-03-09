import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    public StudyGroupIterator(List<Student> list) {
        this.list = list;
    }
    private List<Student> list = new ArrayList<>();
    int count;
    @Override
    public boolean hasNext() {
        return count < list.size();
    }
    @Override
    public Student next() {
        return list.get(count++);
    }
}
