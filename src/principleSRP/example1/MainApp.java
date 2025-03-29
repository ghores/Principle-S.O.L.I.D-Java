package principleSRP.example1;

import principleSRP.example1.correct.Product;
import principleSRP.example1.correct.ProductTaxCalculator;

public class MainApp {
    public static void main(String[] args) {
        /* Wrong Example */
        /*Product apple = new Product(
                1,
                "Apple",
                80000,
                0.09f
        );
        Float totalPrice = (float) (5 * apple.getPrice());
        totalPrice += apple.calculateTax() * 5;
        System.out.println(totalPrice);*/

        /* Correct Example */
        ProductTaxCalculator taxCalculator = new ProductTaxCalculator();
        Product apple = new Product(
                1,
                "Apple",
                80000,
                0.09f
        );
        Integer kg = 5;
        Float totalPrice = (float) (kg * apple.getPrice());
        totalPrice += taxCalculator.calculateTax(apple) * kg;
        System.out.println(totalPrice);
    }
}
