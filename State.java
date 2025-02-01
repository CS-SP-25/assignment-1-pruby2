public abstract class State {
    SalesTaxBehavior taxBehavior; 

    public void setTaxBehavior(SalesTaxBehavior taxBehavior) {
        this.taxBehavior = taxBehavior; 
    }
    
    public void showTax(double value) {
        double tax = taxBehavior.compute(value); // computes the tax
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, getClass().getSimpleName(), tax);
    }
}
