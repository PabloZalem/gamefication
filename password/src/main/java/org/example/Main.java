package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String senha = scanner.nextLine();
            long variacoes = 1;

            for (char c : senha.toCharArray()) {
                if ("aeiosAEIOS".indexOf(c) != -1) {
                    variacoes *= 3;
                } else if (Character.isLetter(c)) {
                    variacoes *= 2;
                }
            }

            System.out.println(variacoes);
        }

        scanner.close();
    }
}