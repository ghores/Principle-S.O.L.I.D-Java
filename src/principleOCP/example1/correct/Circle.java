package principleOCP.example1.correct;

public class Circle implements Shape {
    private Integer radius;

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public Integer getArea() {
        return (int) (Math.PI * radius * radius);
    }
}
