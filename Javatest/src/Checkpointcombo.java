import java.util.Scanner;

public class Checkpointcombo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tickets = {"Cinema Ticket", "Bus Ticket", "Concert Ticket"};
        double[] prices = {5.0, 2.5, 15.0};

        System.out.println("===== Ticket Menu =====");
        for (int i = 0; i < tickets.length; i++) {
            System.out.println((i + 1) + ". " + tickets[i] + " - $" + prices[i]);
        }

        System.out.print("Choose a ticket (1-3): ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= tickets.length) {

            System.out.println("You selected: " + tickets[choice - 1]);
            System.out.println("Price: $" + prices[choice - 1]);

            System.out.print("\nChoose new ticket to update (1-3): ");
            int newChoice = sc.nextInt();

            if (newChoice >= 1 && newChoice <= tickets.length) {
                System.out.println("\nUpdated Ticket:");
                System.out.println("Ticket: " + tickets[newChoice - 1]);
                System.out.println("Price: $" + prices[newChoice - 1]);
            } else {
                System.out.println("Invalid update choice!");
            }

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
