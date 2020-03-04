import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques1 {
    public static void main(String[] arg) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String s =stdin.readLine();
        String [] array = s.split("(?=\\p{Punct}) | (?<=\\p{Punct}) | (?<=\\s) | (?=\\s)");
        System.out.println("Output!!!");
        for (int i = 0; i<array.length;i++)
        {
            // System.out.println(array[i]);
            StringBuffer r = new StringBuffer(array[i]);
            System.out.println(r.reverse()+ " ");
        }
    }
}
