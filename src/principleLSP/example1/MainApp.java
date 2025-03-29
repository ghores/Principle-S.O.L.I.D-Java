package principleLSP.example1;

import principleLSP.example1.correct.Duck;
import principleLSP.example1.correct.Flyable;
import principleLSP.example1.correct.MallardDuck;
import principleLSP.example1.correct.RubberDuck;

public class MainApp {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck(2500, "Brown");
        if (duck1 instanceof Flyable) {
            ((Flyable) duck1).fly();
        }
        Duck duck2 = new RubberDuck(200, "Yellow");
    }
}
