package cinema;

import java.util.Scanner;

public class Stage4 {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        String[][] seatMap = new String[rows + 1][seats + 1];
        for (int i = 0; i <= rows; i++) {
            if (i == 0) {
                for (int j = 0; j <= seats; j++) {
                    if (j == 0) {
                        seatMap[i][j] = "  ";
                    } else {
                        seatMap[i][j] = j + " ";
                    }
                }
            } else {
                seatMap[i][0] = i + " ";
                for (int j = 1; j <= seats; j++) {
                    seatMap[i][j] = "S ";
                }
            }
        }

        int choice = 0;
        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Cinema:");
                    for (int i = 0; i <= rows; i++) {
                        for (int j = 0; j <= seats; j++) {
                            System.out.print(seatMap[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nEnter a row number:");
                    int row = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seat = scanner.nextInt();

                    int ticketPrice = ((rows * seats) <= 60) ? 10 : ((row <= Math.floor(rows / 2.0)) ? 10 : 8);
                    System.out.println("Ticket price: $" + ticketPrice);

                    for (int i = 0; i <= rows; i++) {
                        for (int j = 0; j <= rows; j++) {
                            if (i == row && j == seat) {
                                seatMap[i][j] = "B ";
                            }
                        }
                    }
                    break;
                case 0:
                    return;
            }
        } while (choice != 0);
        scanner.close();
    }
}