package principleOCP.example1.correct;

public class AreaCalculator {
    public Integer calculateArea(Shape[] shapes) {
        Integer sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }

    public Integer calculateArea(Shape shape) {
        return shape.getArea();
    }
}
