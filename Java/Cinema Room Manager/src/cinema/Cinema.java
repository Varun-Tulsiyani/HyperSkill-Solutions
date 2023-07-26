package cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

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
                    System.out.print("S\s");
                }
            }
        }

        System.out.println("\nEnter a row number:");
        int row = scanner.nextInt();
        System.out.println("Enter a seat number in that row");
        int seat = scanner.nextInt();

        int ticketPrice = 0;
        ticketPrice = ((rows * seats) <= 60) ? 10 : ((row <= Math.floor(rows / 2)) ? 10 : 8);

        System.out.println("Ticket price: $" + ticketPrice);

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
                    if (i == row && j == seat) {
                        System.out.print("B\s");
                    } else {
                        System.out.print("S\s");
                    }
                }
            }
        }

        scanner.close();
    }
}