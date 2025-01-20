package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int height = scanner.nextInt();

            for (int i = 1; i <= height; i++) {
                for (int space = 1; space <= height - i; space++) {
                    System.out.print(" ");
                }

                for (int star = 1; star <= i * 2 - 1; star++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int space = 1; space <= height - 1; space++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        if (scanner.hasNextInt()) {
            System.out.println();
        }

        scanner.close();
    }
}
