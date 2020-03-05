import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalComparator {
    public static void main(String[] args) throws IOException {
        double first;
        double second;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number: ");
        first = Double.parseDouble(stdin.readLine());
        System.out.println("Enter Second Number: ");
        second = Double.parseDouble(stdin.readLine());
        System.out.println(areEqualByThreeDecimalPlaces(first,second));
    }
    public static  boolean areEqualByThreeDecimalPlaces(double x,double y)
    {
        if((int)(x*1000 )== (int)(y*1000))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
