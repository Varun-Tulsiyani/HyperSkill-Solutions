package cinema;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        for (int i = 0; i <= 7; i++) {
            if (i == 0) {
                for (int j = 0; j <= 8; j++) {
                    if (j == 0) {
                        System.out.print("\s\s");
                    } else {
                        System.out.print(j + "\s");
                    }
                }
            } else {
                System.out.println();
                System.out.print(i + "\s");
                for (int j = 0; j < 8; j++) {
                    System.out.print("S\s");
                }
            }
        }

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        int userChoice = 0;
        do {
            System.out.println("1. Show the seats" + "\n2. Buy a ticket" + "\n0. Exit");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Cinema:");
                    for (int i = 0; i <= rows; i++) {
                        if (i == 0) {
                            for (int j = 0; j <= seats; j++) {
                                if (j == 0) {
                                    System.out.print("\s\s");
                                } else {
                                    System.out.print(j + "\s");
                                }
                            }
                        } else {
                            System.out.println();
                            System.out.print(i + "\s");
                            for (int j = 1; j <= seats; j++) {
                                if (i == rows && j == seats) {
                                    System.out.print("B\s");
                                } else {
                                    System.out.print("S\s");
                                }
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter a row number:");
                    int row = scanner.nextInt();
                    System.out.println("Enter a seat number in that row");
                    // int seat = scanner.nextInt();
                    int ticketPrice = ((rows * seats) <= 60) ? 10 : ((row <= Math.floor(rows / 2)) ? 10 : 8);
                    System.out.println("Ticket price: $" + ticketPrice);
                    break;
            }
        } while (userChoice != 0);

        scanner.close();
    }
}