package principleLSP.example1.wrong;

public class MallardDuck extends Duck {

    public MallardDuck(Integer weight, String color) {
        super(weight, color);
    }

    @Override
    public void fly() {
        System.out.println("Flying Mallard Duck");
    }

    @Override
    public void swim() {
        System.out.println("Swimming Mallard Duck");
    }

    @Override
    public void sound() {
        System.out.println("Quack Quack");
    }
}
