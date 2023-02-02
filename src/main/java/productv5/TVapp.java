package productv5;

import java.util.Scanner;

public class TVapp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the TV Viewer");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter TV code: ");
            String tvCode = sc.nextLine();  // read the TV code

            // get the TV object
            TV yourTV = TVDB.getTV(tvCode);

            // display the output
            System.out.println();
            if (yourTV != null) {
                System.out.println("Description: " + yourTV.toString());
                System.out.println("Price:       " + yourTV.getPriceFormatted());
            } else {
                System.out.println("No TV matches this TV code.");
            }

            System.out.println();
            System.out.println("TV count: " + TV.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
    }
}
