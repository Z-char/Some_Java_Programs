public class RectangleDriver {
    public static void main(String[] args) {
       Rectangle r = new Rectangle(10, 5);
       Rectangle r2 = new Rectangle(101, 5);
       Rectangle r3 = new Rectangle(10, 52);
       System.out.println("The area is " + r.getArea());
       System.out.println("The area is " + r2.getArea());
       System.out.println("The area is " + r3.getArea());
    }
}