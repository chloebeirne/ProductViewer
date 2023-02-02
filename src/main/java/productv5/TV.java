package productv5;

import java.text.NumberFormat;

public class TV {

    private double price;
    private String description;
    private String code;
    private String screenSize;
    private String manufacture;
    protected static int count = 0;

    public Music(){
        price = 0.0;
        description = "";
        code = "";
        screenSize = "";
        manufacture = "";
        count++;
    }

    public void setPrice(double price){ this.price = price; }
    public double getPrice(){ return price; }

    public void setDescription(String description){ this.description = description; }
    public String getDescription(){ return description; }

    public void setCode(String code){ this.code = code; }
    public String getCode(){ return code; }

    public void setScreenSize(String screenSize){ this.screenSize = screenSize; }
    public String getScreenSize(){ return screenSize; }

    public void setManufacture(String manufacture){ this.manufacture = manufacture; }
    public String getManufacture(){ return manufacture; }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString(){ return description + " by " + screenSize + " by " + manufacture; }

    public static int getCount(){ return count; }
}
