import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int n1 = o1.getListOfGroups().size();
        int n2 = o2.getListOfGroups().size();
        return o1.compareTo(o2);
    }
}
