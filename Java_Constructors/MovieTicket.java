import java.util.Scanner;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(Scanner sc) {
        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        seatNumber = sc.nextLine();
        System.out.print("Enter Ticket Price: ");
        price = sc.nextDouble();
        sc.nextLine(); // Clear buffer
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: ₹" + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3; // Number of tickets
        MovieTicket[] tickets = new MovieTicket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Booking Ticket " + (i + 1));
            tickets[i] = new MovieTicket();
            tickets[i].bookTicket(sc);
        }

        System.out.println("\n--- All Booked Tickets ---");
        for (MovieTicket ticket : tickets) {
            ticket.displayTicket();
        }
    }
}
