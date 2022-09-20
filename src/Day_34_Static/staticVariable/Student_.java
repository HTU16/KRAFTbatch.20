package Day_34_Static.staticVariable;

public class Student_ {


    int number;
    String name;

    static String schoolName = "KRAFT";

    public Student_(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getInfo() {
        return "Student_{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
