public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int age;
    private int id;
    private int yearOfEntering;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "" +
                "" + name  +
                " " + surname +
                ", Возраст:" + age;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(age, o.getAge());
    }
}
