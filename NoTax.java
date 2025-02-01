public class NoTax implements SalesTaxBehavior {
    public double compute(double value) {
        return 0; // no tax
    }
}
