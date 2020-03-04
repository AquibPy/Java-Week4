interface printable
{
    void print();
}
interface showable
{
    void show();
}
public class ques2 implements printable,showable {
    public void print()
    {
        System.out.println("Hello");
    }

    public void show()
    {
        System.out.println("World");
    }
    public  static void main(String [] arg)
    {
        ques2 q = new ques2();
        q.print();
        q.show();
    }
}
