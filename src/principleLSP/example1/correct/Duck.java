package principleLSP.example1.correct;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Duck {
    private Integer weight;
    private String color;

    public abstract void swim();

    public abstract void sound();
}
