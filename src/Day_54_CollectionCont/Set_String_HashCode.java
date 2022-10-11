package Day_54_CollectionCont;

import java.util.HashSet;
import java.util.Set;

public class Set_String_HashCode {
    public static void main(String[] args) {

        System.out.println("new String(\"htu\").hashCode() = " + new String("htu").hashCode());  //103657
        System.out.println("\"htu\".hashCode() = " + "htu".hashCode());  //103657

        Set<String> alfonsoSet=new HashSet<>();
        alfonsoSet.add("htu");
        alfonsoSet.add("jamiryo");
        alfonsoSet.add("juninho");
        alfonsoSet.add("htu");

        System.out.println("alfonsoSet = " + alfonsoSet);


        Student s1=new Student("adunis",25);
        Student s2=new Student("adunis",25);
        Student s3=new Student("adunis",25);

        System.out.println(s1.hashCode());  //824909230
        System.out.println(s2.hashCode());  //122883338              //hashcode ları farklı..
        System.out.println(s3.hashCode());  //666641942

        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        Set<Object> StudentSet=new HashSet<>();
        StudentSet.add(s1);
        StudentSet.add(s2);
        StudentSet.add(s3);

        System.out.println("StudentSet = " + StudentSet);
        System.out.println("StudentSet.size() = " + StudentSet.size());
    }
}
