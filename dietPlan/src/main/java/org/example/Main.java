package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número de casos de teste
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            // Lê a dieta, café da manhã e almoço
            String dieta = scanner.nextLine();
            String cafeManha = scanner.nextLine();
            String almoco = scanner.nextLine();

            // Converte a dieta para um conjunto para facilitar o controle
            Set<Character> dietaSet = new HashSet<>();
            for (char c : dieta.toCharArray()) {
                dietaSet.add(c);
            }

            // Remove alimentos consumidos no café da manhã e almoço
            String consumido = cafeManha + almoco;
            boolean cheater = false;

            for (char c : consumido.toCharArray()) {
                if (dietaSet.contains(c)) {
                    dietaSet.remove(c);
                } else {
                    // Se consumiu algo fora da dieta, é trapaceiro
                    cheater = true;
                    break;
                }
            }

            if (cheater) {
                System.out.println("CHEATER");
            } else {
                // Converte o conjunto restante para uma lista e ordena
                List<Character> restante = new ArrayList<>(dietaSet);
                Collections.sort(restante);
                StringBuilder resultado = new StringBuilder();
                for (char c : restante) {
                    resultado.append(c);
                }
                System.out.println(resultado);
            }
        }

        scanner.close();
    }
}
