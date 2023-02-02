package productv5;

import java.text.NumberFormat;

public class Music {

    private double price;
    private String description;
    private String code;
    private String artist;
    private String label;
    protected static int count = 0;

    public Music(){
        price = 0.0;
        description = "";
        code = "";
        artist = "";
        label = "";
        count++;
    }

    public void setPrice(double price){ this.price = price; }
    public double getPrice(){ return price; }

    public void setDescription(String description){ this.description = description; }
    public String getDescription(){ return description; }

    public void setCode(String code){ this.code = code; }
    public String getCode(){ return code; }

    public void setArtist(String artist){ this.artist = artist; }
    public String getArtist(){ return artist; }

    public void setLabel(String label){ this.label = label; }
    public String getLabel(){ return label; }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString(){ return description + " by " + artist + " by " + label; }

    public static int getCount(){ return count; }
}
