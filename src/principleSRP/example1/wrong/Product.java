package principleSRP.example1.wrong;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Float taxRatio;

    public Float calculateTax() {
        return price * taxRatio;
    }
}
