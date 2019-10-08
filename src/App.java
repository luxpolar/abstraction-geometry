import ar.com.ada.geometry.abst.Figure;
import ar.com.ada.geometry.subclass.Circle;
import ar.com.ada.geometry.subclass.Rectangle;
import ar.com.ada.geometry.subclass.Triangle;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<Figure>();
        Scanner scanner = new Scanner(System.in);
        int choise, i = 0;
        do {
            System.out.println("Elija la figura cuya área quiere calcular: 1. Rectángulo; 2. Círculo; 3. Triángulo.");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    Rectangle rect1 = new Rectangle();
                    System.out.println("Ingrese el valor de la base del rectángulo: ");
                    Double widthRec = scanner.nextDouble();
                    System.out.println("Ingrese el valor de la altura del rectángulo: ");
                    Double hightRec = scanner.nextDouble();
                    rect1.setWidth(widthRec);
                    rect1.setHight(hightRec);
                    figures.add(rect1);
                    i++;
                    break;
                case 2:
                    System.out.println("Ingrese el valor del radio del círculo: ");
                    Double radius1 = scanner.nextDouble();
                    Circle cir1 = new Circle(radius1);
                    figures.add(cir1);
                    i++;
                    break;
                case 3:
                    Triangle tri1 = new Triangle();
                    System.out.println("Ingrese el valor de la base del rectángulo: ");
                    Double widthTri = scanner.nextDouble();
                    System.out.println("Ingrese el valor de la altura del rectángulo: ");
                    Double hightTri = scanner.nextDouble();
                    tri1.setWidth(widthTri);
                    tri1.setHight(hightTri);
                    figures.add(tri1);
                    i++;
                    break;
                default:
                    System.out.println("Figura no existente.");
            }
        } while(i < 3);

        for (int j = 0; j < figures.size(); j++) {
            Figure figure = figures.get(j);
            System.out.println("El área de la figura " + j + " es:" + figure.showArea());
            System.out.println("Y la figura es: " + figure.toString());
        }

    }
}
