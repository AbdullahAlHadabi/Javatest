import java.util.Scanner;
public class checkpointcombo1212 {
    public static void main(String [] agrs){

        Scanner sc = new Scanner(System.in);

        System.out.println("chooes your ticket type");

        String[] tickets = {"Cinema Ticket", "Bus Ticket", "Concert Ticket"};
        double[] prices = {5.0, 2.5, 15.0};


        System.out.println("===== Ticket Menu =====");
        for (int i = 0; i < tickets.length; i++) {
            System.out.println((i + 1) + ". " + tickets[i] + " - $" + prices[i]);
        }

        System.out.print("Choose a ticket (1-3): ");
        int choice = sc.nextInt();

        if(choice >= 1 && choice <= tickets.length){

            System.out.println("You selected: " + tickets[choice - 1]);
            System.out.println("Price: $" + prices[choice - 1]);



        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();








    }
}
