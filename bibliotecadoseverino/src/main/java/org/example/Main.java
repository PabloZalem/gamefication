package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<String> codigos = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                codigos.add(scanner.next());
            }

            // Ordena os códigos em ordem crescente
            Collections.sort(codigos);

            // Imprime os códigos ordenados
            for (String codigo : codigos) {
                System.out.println(codigo);
            }
        }
    }
}