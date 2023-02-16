package ie.atu.productv6;

import java.text.NumberFormat;

public class Dog {

    private String vaccination;
    private String shedding;
    private String neutered;
    protected static int count = 0;

    public Dog(){
        vaccination = "";
        shedding = "";
        neutered = "";
        count++;
    }

    public void setVaccination(String vaccination){ this.vaccination = vaccination; }
    public String getVaccination(){ return vaccination; }

    public void setShedding(String shedding){ this.shedding = shedding; }
    public String getShedding(){ return shedding; }

    public void setNeutered(String neutered){ this.neutered = neutered; }
    public String getNeutered(){ return neutered }

    public String toString(){ return vaccination + " by " + shedding + " by " + neutered; }

    public static int getCount(){ return count; }
}

