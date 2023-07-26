package cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----STAGE ONE-----");
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

        System.out.println("\n-----STAGE ONE-----");
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row");
        int seats = scanner.nextInt();

        int totalSeats = rows * seats;
        int profit = 0, frontHalf = 0, backHalf = 0;

        if (rows % 2 != 0) {
            frontHalf = ((int) Math.floor(rows / 2.00)) * seats;
            backHalf = ((int) Math.ceil(rows / 2.00)) * seats;
        } else {
            frontHalf = totalSeats / 2;
            backHalf = totalSeats / 2;
        }

        if (totalSeats <= 60) {
            profit = totalSeats * 10;
        } else {
            profit = (frontHalf * 10) + (backHalf * 8);
        }

        System.out.println("Total income:\n$" + profit);
        scanner.close();
    }
}