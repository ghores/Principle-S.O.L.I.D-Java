package principleOCP.example1.correct;

public class Triangle implements Shape {
    private Integer base;
    private Integer height;

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public Integer getArea() {
        return (int) (0.5 * base * height);
    }
}
