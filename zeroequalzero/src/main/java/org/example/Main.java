package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            if (N == 0 && M == 0) break;

            int soma = N + M;

            String somazero = String.valueOf(soma).replace("0", "");
            System.out.println(somazero);
        }

        scanner.close();
    }
}
