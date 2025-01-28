package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            String b = scanner.next();

            if (b.length() > a.length()) {
                System.out.println("nao encaixa");
            } else {
                String aEnd = a.substring(a.length() - b.length());
                System.out.println(aEnd.equals(b) ? "encaixa" : "nao encaixa");
            }
        }

        scanner.close();
    }
}