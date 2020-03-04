import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques5 {
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        Instructor i = new Instructor();
        System.out.println(s.toString());
        System.out.println(i.toString());
    }
}
class Person
{
    String name;
    int year;
    Person() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name: ");
        name = stdin.readLine();
        System.out.println("Enter Year of Birth: ");
        year = Integer.parseInt(stdin.readLine());
    }
    public String toString()
    {
        return "Name: "+ name + "Year of Birth: " + year;
    }
}
class Student extends Person
{
    String major;

    Student() throws IOException {
        System.out.println("Enter Major of Student:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        major = stdin.readLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", Year=" + year +
                ", Major='" + major + '\'' +
                '}';
    }
}

class Instructor extends Person
{
    int salary;

    Instructor() throws IOException {
        System.out.println("Enter Salary:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        salary = Integer.parseInt(stdin.readLine());
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "Name='" + name + '\'' +
                ", Year=" + year +
                ", Salary=" + salary +
                '}';
    }
}
