import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Elijah's Adventure Game!");
        System.out.println("You wake up in a dark room. Do you go LEFT or RIGHT?");

        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("left")) {
            System.out.println("You find a door. Do you OPEN it or LEAVE it?");
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("open")) {
                System.out.println("You escaped! You win!");
            } else {
                System.out.println("You stay trapped forever. Game over.");
            }

        } else if (choice.equals("right")) {
            System.out.println("You fall into a pit. Game over.");
        } else {
            System.out.println("Invalid choice. Game over.");
        }

        scanner.close();
    }
}
