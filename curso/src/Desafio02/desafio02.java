package Desafio02;

import java.util.Scanner;
import java.util.ArrayList;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ninjas = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção:");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Escreva fim quando acabar");
                    for (String nome = scanner.nextLine(); !nome.equalsIgnoreCase("fim"); nome = scanner.nextLine()) {
                        ninjas.add(nome);
                    }
                    break;

                case "2":
                    System.out.println("\nNinjas cadastrados:");
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        for (String ninja : ninjas) {
                            System.out.println("- " + ninja);
                        }
                    }
                    break;

                case "3":
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        }
    }

}
