package cinema;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CinemaRoomManager {
    public static void main(String[] args) {
        // Write your code here
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        int tickets = 0;
        double percentage = 0.00;
        int currentIncome = 0;

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int totalSeats = rows * seats;

        int totalIncome = (totalSeats <= 60) ? totalSeats * 10
                : (int) (Math.floor(rows / 2.0) * seats * 10) + (int) (Math.ceil(rows / 2.0) * seats * 8);

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

        int choice;
        do {
            boolean repeat = true;
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Cinema:");
                    for (int i = 0; i <= rows; i++) {
                        for (int j = 0; j <= seats; j++) {
                            System.out.print(seatMap[i][j]);
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    while (repeat) {
                        System.out.println("\nEnter a row number:");
                        int row = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        int seat = scanner.nextInt();

                        if (row <= rows && seat <= seats) {
                            for (int i = 0; i <= rows; i++) {
                                for (int j = 0; j <= seats; j++) {
                                    if (i == row && j == seat) {
                                        if (seatMap[i][j].equals("S ")) {
                                            seatMap[i][j] = "B ";
                                            int ticketPrice = (totalSeats <= 60) ? 10
                                                    : ((row <= Math.floor(rows / 2.0)) ? 10 : 8);
                                            System.out.println("Ticket price: $" + ticketPrice);
                                            tickets++;
                                            percentage = (double) tickets / totalSeats * 100;
                                            currentIncome += ticketPrice;
                                            repeat = false;
                                        } else {
                                            System.out.println("That ticket has already been purchased!");
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("Wrong input!");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Number of purchased tickets: " + tickets);
                    System.out.println("Percentage: " + decimalFormat.format(percentage) + "%");
                    System.out.println("Current income: $" + currentIncome);
                    System.out.println("Total income: $" + totalIncome);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Wrong input!");
            }
        } while (true);
    }
}