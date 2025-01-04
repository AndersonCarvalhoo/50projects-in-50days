import java.util.ArrayList;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangule;
import entities.Shape;
import entities.enums.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        Integer n = scan.nextInt();

        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)");
            char shapeInput = scan.next().toLowerCase().charAt(0);
            scan.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            String colorInput = scan.nextLine().toUpperCase();

            if (shapeInput == 'r') {
                System.out.print("Width: ");
                Double widthInput = scan.nextDouble();
                System.out.print("Height: ");
                Double heightInput = scan.nextDouble();
                shapes.add(new Rectangule(Color.valueOf(colorInput), widthInput, heightInput));
                continue;
            }
            System.out.print("Radius: ");
            Double radiusInput = scan.nextDouble();
            shapes.add(new Circle(Color.valueOf(colorInput), radiusInput));
        }
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
        scan.close();
    }
}
