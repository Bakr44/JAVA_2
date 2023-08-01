public class Main {
    public static void main(String[] args)
    {
        Shape s1=new Shape("Red",false);

        Shape s2=new Shape();
        s2.setColor("Blue");
        s2.setFilled(true);

        Shape s3=new Shape();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(" ");

        Circle c1=new Circle();
        c1.setRadius(25.0);
        System.out.println("Circle area: " + c1.getArea());
        System.out.println("Circle perimeter: " +c1.getPerimeter());
        System.out.println(c1.toString());
        System.out.println(" ");
        Circle c2=new Circle("purple",true,60);
        System.out.println("Circle area: " + c2.getArea());
        System.out.println("Circle perimeter: " +c2.getPerimeter());
        System.out.println(c2.toString());
        System.out.println(" ");

        Rectangle r1=new Rectangle("Yellow",false,3,5);
        System.out.println("Rectangle area wideth=3 ,length=5: " +r1.getArea());
        System.out.println("Rectangle perimeter: " +r1.getPerimeter());
        System.out.println(r1.toString());
        System.out.println(" ");
        Rectangle r2=new Rectangle(20,10);
        System.out.println("Rectangle area wideth=20 ,length=10: " +r2.getArea());
        System.out.println("Rectangle perimeter: " +r2.getPerimeter());
        System.out.println(r2.toString());
        System.out.println(" ");

        Square sq1=new Square(2.0);
        System.out.println("Square area side=2: " +sq1.getArea());
        System.out.println("Square perimeter: " +sq1.getPerimeter());
        System.out.println(sq1.toString());
        System.out.println(" ");

        Square sq2=new Square();
        sq2.setSide(40);
        System.out.println("Square area side=40: " +sq2.getArea());
        System.out.println("Square perimeter: " +sq2.getPerimeter());
        System.out.println(sq2.toString());
    }
}