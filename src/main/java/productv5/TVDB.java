package productv5;

public class TVDB {

    public static TV getTV(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data


        TV myTV = null;
        if (productCode.equalsIgnoreCase("toshiba")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("4K ultra HD");
            myTV.setPrice(299.00);
            myTV.setScreenSize("50 inch");
            myTV.setManufacture("Toshiba");
        } else if (productCode.equalsIgnoreCase("tcl")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("QLED Fire TV");
            myTV.setPrice(379.00);
            myTV.setScreenSize("55 inch");
            myTV.setManufacture("TCL");
        } else if (productCode.equalsIgnoreCase("samsung")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("4K Smart TV");
            myTV.setPrice(449.00);
            myTV.setScreenSize("55 inch");
            myTV.setManufacture("Samsung");
        }

        return myTV;
    }
}
