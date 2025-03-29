package principleLSP.example1.wrong;

public class RubberDuck extends Duck {

    public RubberDuck(Integer weight, String color) {
        super(weight, color);
    }

    @Override
    public void fly() {
        //????
    }

    @Override
    public void swim() {
        System.out.println("Swimming Rubber Duck");
    }

    @Override
    public void sound() {
        System.out.println("Booogh Booogh");
    }
}
