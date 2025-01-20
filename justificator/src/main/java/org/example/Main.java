package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                String formatted = formatedLine(line);
                System.out.println(formatted);
            }
        }
    }

    private static String formatedLine(String line) {
        return line.trim().replaceAll("\\s+", " ");
    }
}
