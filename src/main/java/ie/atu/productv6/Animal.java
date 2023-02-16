package ie.atu.productv6;

import java.text.NumberFormat;

public class Animal {

    private double price;
    private String type;
    private String age;
    private String breed;
    protected static int count = 0;

    public Music(){
        price = 0.0;
        type = "";
        age = "";
        breed = "";
        count++;
    }

    public void setPrice(double price){ this.price = price; }
    public double getPrice(){ return price; }

    public void setType(String type){ this.type = type; }
    public String getType(){ return type; }

    public void setAge(String age){ this.age = age; }
    public String getAge(){ return age; }

    public void setBreed(String breed){ this.breed = breed; }
    public String getBreed(){ return breed }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString(){ return type + " by " + age + " by " + breed; }

    public static int getCount(){ return count; }
}

