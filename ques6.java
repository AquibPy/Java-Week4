import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques6 {
    public static void main(String[] args) throws IOException {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();
        int s1 = m1.display();
        int s2 = m2.display();
        int s3 = m3.display();
        int b1 = m1.bonus();
        int b2 = m2.bonus();
        int b3 = m3.bonus();
        if(s1+b1>s2+b2)
        {
            if(s1+b1>s3+b3)
            {
                Manager.max(m1);
            }
            else
            {
                Manager.max(m3);
            }
        }
        else
        {
            if(s2+b2>s3+b3)
            {
                Manager.max(m2);
            }
            else
            {
                Manager.max(m3);
            }
        }

    }
}

class Employee {
    private int id, salary;
    private String name, department;
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    Employee() throws IOException {
        System.out.println("Enter ID:");
        id = Integer.parseInt(stdin.readLine());
        System.out.println("Enter Name:");
        name = stdin.readLine();
        System.out.println("Enter Department:");
        department = stdin.readLine();
        System.out.println("Enter Salary:");
        salary = Integer.parseInt(stdin.readLine());
    }

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void accept() throws IOException {
        System.out.println("Enter ID:");
        id = Integer.parseInt(stdin.readLine());
        System.out.println("Enter Name:");
        name = stdin.readLine();
        System.out.println("Enter Department:");
        department = stdin.readLine();
        System.out.println("Enter Salary:");
        salary = Integer.parseInt(stdin.readLine());
    }

    int display() {
        return salary;
    }

    static void max(Employee m) {
        System.out.println("\nName: " + m.name + "\nID: " + m.id + "\nDepartment: " + m.department + "\nSalary:" + m.salary);
    }
}

class  Manager extends Employee
{
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    private int bonus ;
    Manager() throws IOException {
        System.out.println("Enter Bonus: ");
        bonus = Integer.parseInt(stdin.readLine());
    }
    void accept() throws IOException {
        System.out.println("Enter Bonus: ");
        bonus = Integer.parseInt(stdin.readLine());
    }
    int bonus()
    {
        return  bonus;
    }
}