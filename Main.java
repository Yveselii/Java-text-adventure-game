import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            boolean hasKey = false; // inventory resets each game

            System.out.println("\nWelcome to the Text Adventure Game!");
            System.out.println("You wake up in a dark room.");
            System.out.println("Do you go LEFT or RIGHT?");

            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("left")) {
                System.out.println("You see a door and a small table.");
                System.out.println("On the table is a key.");
                System.out.println("Do you TAKE the key or IGNORE it?");

                choice = scanner.nextLine().toLowerCase();

                if (choice.equals("take")) {
                    hasKey = true;
                    System.out.println("You picked up the key.");
                } else {
                    System.out.println("You leave the key behind.");
                }

                System.out.println("You now face a locked door.");
                System.out.println("Do you OPEN the door or WALK away?");

                choice = scanner.nextLine().toLowerCase();

                if (choice.equals("open")) {
                    if (hasKey) {
                        System.out.println("You unlock the door and escape. You win!");
                    } else {
                        System.out.println("The door is locked. Game over.");
                    }
                } else {
                    System.out.println("You walk away and get lost. Game over.");
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
