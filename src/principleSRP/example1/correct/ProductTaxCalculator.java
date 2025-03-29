package principleSRP.example1.correct;

public class ProductTaxCalculator {
    public Float calculateTax(Product product) {
        return product.getPrice() * product.getTaxRatio();
    }
}
