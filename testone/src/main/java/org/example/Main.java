package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            scanner.nextLine();

            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                String formated = formatedLine(line);
                System.out.println(formated);
            }
        }
        scanner.close();
    }

    private static String formatedLine(String line) {
        return line.trim().replaceAll("\\s+", "");
    }
}