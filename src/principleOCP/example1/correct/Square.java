package principleOCP.example1.correct;

public class Square implements Shape {
    private Integer width;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public Integer getArea() {
        return width * width;
    }
}
