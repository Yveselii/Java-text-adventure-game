import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            System.out.println("\nWelcome to Elijah's Text Adventure Game!");
            System.out.println("You wake up in a dark room.");
            System.out.println("Do you go LEFT or RIGHT?");

            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("left")) {
                System.out.println("You see a door and a window.");
                System.out.println("Do you OPEN the door or CLIMB the window?");

                choice = scanner.nextLine().toLowerCase();

                if (choice.equals("open")) {
                    System.out.println("The door leads outside. You escaped! You win!");
                } else if (choice.equals("climb")) {
                    System.out.println("You fall and get hurt. Game over.");
                } else {
                    System.out.println("Invalid choice. Game over.");
                }

            } else if (choice.equals("right")) {
                System.out.println("You walk down a hallway and see stairs.");
                System.out.println("Do you go UP or DOWN?");

                choice = scanner.nextLine().toLowerCase();

                if (choice.equals("up")) {
                    System.out.println("You find help upstairs. You win!");
                } else if (choice.equals("down")) {
                    System.out.println("It's a dead end. Game over.");
                } else {
                    System.out.println("Invalid choice. Game over.");
                }

            } else {
                System.out.println("Invalid choice. Game over.");
            }

            System.out.println("\nDo you want to play again? (yes/no)");
            String again = scanner.nextLine().toLowerCase();

            if (!again.equals("yes")) {
                playing = false;
                System.out.println("Thanks for playing!");
            }
        }

        scanner.close();
    }
}
