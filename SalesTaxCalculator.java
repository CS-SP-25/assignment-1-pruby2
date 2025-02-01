public class SalesTaxCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error"); // not enough input
            return; // exit
        }

        // parse the inputs
        String stateName = args[0];
        Double SaleAmount = Double.parseDouble(args[1]);

        State state;
        if (stateName.equalsIgnoreCase("Indiana")) { // create objects if they are Indiana or Alaska
            state = new Indiana();
            state.setTaxBehavior(new SevenPercent());
        } else if (stateName.equalsIgnoreCase("Alaska")) {
            state = new Alaska();
            state.setTaxBehavior(new NoTax());
        } else if (stateName.equalsIgnoreCase("Hawaii")) { //create a case for new state hawaii 
            state = new Hawaii();
            state.setTaxBehavior(new FourPercent());
        } else {
            System.out.println("Error"); // not alaska or indiana or hawaii
            return;
        }

        state.showTax(SaleAmount); // calculate the sales based on state
    }
}