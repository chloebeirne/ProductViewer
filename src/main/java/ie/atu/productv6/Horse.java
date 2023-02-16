package ie.atu.productv6;

import java.text.NumberFormat;

public class Dog {

    private String dam;
    private String sire;
    private String height;
    protected static int count = 0;

    public Dog(){
        dam = "";
        sire = "";
        height = "";
        count++;
    }

    public void setDam(String dam){ this.dam = dam; }
    public String getDam(){ return dam; }

    public void setSire(String sire){ this.sire = sire; }
    public String getSire(){ return sire; }

    public void setHeight(String height){ this.height = height; }
    public String getHeight(){ return height }

    public String toString(){ return dam + " by " + sire + " by " + height; }

    public static int getCount(){ return count; }

}

