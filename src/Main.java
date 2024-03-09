import java.util.*;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Ivanov", 20);
        Student s2 = new Student("Sergey", "Sergeyev", 19);
        Student s3 = new Student("Oleg", "Olegov", 22);
        Student s4 = new Student("Ivan", "Ivanov", 21);
        System.out.println(s1.compareTo(s4));  //сравнения по возрасту
        List<Student> list1 = new ArrayList<>(List.of(s1, s2, s3, s4));
        StudyGroup g1 = new StudyGroup("1-2024", list1);
        System.out.println(g1);
        Iterator<Student> iter = g1.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        Collections.sort(list1, new StudentComparator());
        System.out.println(g1);
        StudentComparator comparator = new StudentComparator();
        System.out.println(comparator.compare(s1,s4)); //сравнения по компоратору(по имя-фамилии)
        // нижеследующие по дз:
        System.out.println("--------------");
        StudyGroup g2 = new StudyGroup("2-2024", list1); // Я не тратил время чтобы создать отдельные списки студентов новыми студентами
        StudyGroup g3 = new StudyGroup("3-2024", list1); // Надеюсь вы простите это ))
        StudyGroup g4 = new StudyGroup("4-2024", list1);
        StudyGroup g5 = new StudyGroup("5-2024", list1);
        StudyGroup g6 = new StudyGroup("6-2024", list1);
        StudyGroup g7 = new StudyGroup("7-2024", list1);
        StudyGroup g8 = new StudyGroup("8-2024", list1);
        StudyGroup g9 = new StudyGroup("9-2024", list1);
        Stream potok1 = new Stream("a", List.of(g1, g2, g3, g4));
        Stream potok2 = new Stream("b", List.of(g5, g6));
        Stream potok3 = new Stream("c", List.of(g7, g8, g9));
        ArrayList<Stream> listOfStreams = new ArrayList<>(List.of(potok1, potok2, potok3));
        Iterator<Stream> iter2 = listOfStreams.iterator();
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }
        Collections.sort(listOfStreams, new StreamComparator());
        System.out.println("После сортировки по число груп по возрастанию:");
        Iterator<Stream> iter3 = listOfStreams.iterator();
        while (iter3.hasNext()){
            System.out.println(iter3.next());
        }
        System.out.println(potok2.compareTo(potok3));
    }
}