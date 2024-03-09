import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    String number;
    List<Student> group = new ArrayList<>();

    public StudyGroup(String number, List<Student> group) {
        this.number = number;
        this.group = group;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Группа номер: " + number +
                " Состав:" + group;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(group);
    }
}
