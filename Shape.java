interface shapes{
    double area();
}
public abstract class Shape implements shapes
{
    public abstract double area();
}
class Triangle extends  Shape
{
 public double base = 2.0;
 public double height = 6.0;

    @Override
    public double area() {
        return 0.5*base*height;
    }

    public static void main(String[] args) {

        Triangle t = new Triangle();
        System.out.println("Area of Triangle: " + t.area());
    }
}
class Rectangle extends Shape
{
        double length = 20.0;
        double breadth =30 ;

    @Override
    public double area() {
        return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle: " + r.area());
    }
}
