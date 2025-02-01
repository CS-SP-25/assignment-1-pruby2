public class SevenPercent implements SalesTaxBehavior{
    public double compute(double value) {
        return (value * 0.07); // 7% sales tax
    }
}
