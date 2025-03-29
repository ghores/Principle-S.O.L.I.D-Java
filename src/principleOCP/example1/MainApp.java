package principleOCP.example1;

import principleOCP.example1.correct.*;

public class MainApp {
    public static void main(String[] args) {
        /* Wrong Example */
        /*Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(10);
        rectangle1.setHeight(5);*/
        /*Triangle triangle1 = new Triangle();
        triangle1.setBase(5);
        triangle1.setHeight(3);

        AreaCalculator calculator = new AreaCalculator();
        Integer area = calculator.calculateArea(triangle1);
        System.out.println(area);

        /* Correct Example */
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(10);
        rectangle1.setHeight(5);
        Circle circle1 = new Circle();
        circle1.setRadius(15);
        Triangle triangle1 = new Triangle();
        triangle1.setBase(5);
        triangle1.setHeight(3);
        Shape[] shapes = new Shape[3];
        shapes[0] = rectangle1;
        shapes[1] = circle1;
        shapes[2] = triangle1;
        AreaCalculator calculator = new AreaCalculator();
        Integer area = calculator.calculateArea(shapes);
        System.out.println(area);
    }
}
