import ar.com.ada.geometry.subclass.Circle;
import ar.com.ada.geometry.subclass.Rectangle;
import ar.com.ada.geometry.subclass.Triangle;

public class App {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.00);
        Circle circle2 = new Circle(4.00);
        Triangle triangle1 = new Triangle(3.00, 5.6);
        Rectangle rectangle1 = new Rectangle(5.00, 3.00);

        System.out.println(circle1.showArea());
        System.out.println(circle2.showArea());
        System.out.println(rectangle1.showArea());
        System.out.println(triangle1.showArea());
        System.out.println("circle1.equals(circle2) = " + circle1.equals(circle2));
        System.out.println("rectangle1.equals(circle1) = " + rectangle1.equals(circle1));
        System.out.println("rectangle1.equals(triangle1) = " + rectangle1.equals(triangle1));
        System.out.println("triangle1.equals(circle1) = " + triangle1.equals(circle1));

    }
}
