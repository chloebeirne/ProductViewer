package productv5;

import ie.atu.productv5.Music;

public class MusicDB {

    public static Music getMusic(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data


        Music myMusic = null;
        if (productCode.equalsIgnoreCase("dire")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Sultans of Swing");
            myMusic.setPrice(10.00);
            myMusic.setArtist("Dire Straits");
            myMusic.setLabel("Vertigo Records");
        } else if (productCode.equalsIgnoreCase("mac")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Heart to Heart");
            myMusic.setPrice(9.99);
            myMusic.setArtist("Mac DeMarco");
            myMusic.setLabel("Captured Tracks");
        } else if (productCode.equalsIgnoreCase("thunder")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Funny Thing");
            myMusic.setPrice(7.50);
            myMusic.setArtist("Thundercat");
            myMusic.setLabel("Brainfeeder");
        }

        return myMusic;
    }
}
