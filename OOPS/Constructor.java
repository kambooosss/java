package OOPS;
import java.util.*;

public class Constructor {
    public static void main(String[] args) {
        Student kamal = new Student();
        System.out.println(kamal.name +" "+ kamal.roll);
    }

}
class Student
{
    String name;
    int roll;
    Student()
    {
        this("kam",37);//calling constructing inside a constructor 
        // this reffers Student
    }

    Student(String name,int roll)
    {
        this.name=name;//here this refer to reference variable i.e kamal
        this.roll=roll;
    }
}
