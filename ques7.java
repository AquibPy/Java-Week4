import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques7 {
    public static void main(String[] args) throws IOException {
        int n;
        int choice;
        System.out.println("Enter Number of objects:");
        BufferedReader stdin = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        n = Integer.parseInt(stdin.readLine());
        System.out.println("\n1.Heavy Motor Vehicle \n2.Light Motor Vehicle");
        choice =Integer.parseInt(stdin.readLine());
        if(choice == 1)
        {
            HeavyMotorVehicle h[] = new HeavyMotorVehicle[n];
            for (int i =0;i<n;i++)
            {
                h[i] = new HeavyMotorVehicle();
            }
            for (int i = 0;i<n;i++)
            {
                h[i].display();
            }
        }
        else if (choice == 2)
        {
            LightMotorVehicle l[] = new LightMotorVehicle[n];
            for (int i=0;i<n;i++)
            {
                l[i] =  new LightMotorVehicle();
            }
            for (int i =0;i<n;i++)
            {
                l[i].display();
            }
        }
        else
        {
            System.out.println("Invalid Choice !!!!");
        }
    }
}
class Vehicle
{
    String company;
    int price;
    Vehicle() throws IOException {
        System.out.println("Enter Name of Company:");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        company = stdin.readLine();
        System.out.println("Enter Price:");
        price = Integer.parseInt(stdin.readLine());
    }
}
class LightMotorVehicle extends Vehicle
{
    float mileage;
    LightMotorVehicle() throws IOException {
        System.out.println("Enter Mileage");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        mileage = Float.parseFloat(stdin.readLine());
    }
    void display()
    {
        System.out.println("\nCompany: "+ company + "\nPrice: " + price + "\nMileage: " + mileage);
    }
}
class HeavyMotorVehicle extends Vehicle
{
    float capacity;
    HeavyMotorVehicle() throws IOException {
        System.out.println("Enter Capacity in tons");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        capacity = Float.parseFloat(stdin.readLine());
    }
    void display()
    {
        System.out.println("\nCompany: "+ company + "\nPrice: " + price + "\nCapacity(tons) : " + capacity);
    }
}