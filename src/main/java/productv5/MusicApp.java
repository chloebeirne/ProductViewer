package productv5;

import ie.atu.productv5.Music;
import ie.atu.productv5.MusicDB;

import java.util.Scanner;

public class MusicApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Music Viewer");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter Music code: ");
            String musicCode = sc.nextLine();  // read the Music code

            // get the Software object
            Music yourMusic = MusicDB.getMusic(musicCode);

            // display the output
            System.out.println();
            if (yourMusic != null) {
                System.out.println("Description: " + yourMusic.toString());
                System.out.println("Price:       " + yourMusic.getPriceFormatted());
            } else {
                System.out.println("No Music matches this Music code.");
            }

            System.out.println();
            System.out.println("Music count: " + Music.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}
