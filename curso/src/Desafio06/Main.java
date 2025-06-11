package Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void exibirMenu() {
        System.out.println("\nMENU:");
        System.out.println("1 - Adicionar um novo ninja");
        System.out.println("2 - Remover o primeiro ninja da lista");
        System.out.println("3 - Exibir a lista completa");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        LinkedList<String> ninjaList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int opcSelected = -1;
        ninjaList.add("sasuke");
        ninjaList.add("guy");
        ninjaList.add("kisame");
        ninjaList.add("ino");
        ninjaList.add("sakura");
        ninjaList.add("neji");
        ninjaList.add("Shisui");

        while(opcSelected != 0) {
            exibirMenu();
            while (!input.hasNextInt()) {
                System.out.println("Por favor, digite um número válido.");
                input.next();
                exibirMenu();
            }

            opcSelected = input.nextInt();
            input.nextLine();

            switch (opcSelected) {
                case 1:
                    System.out.print("Digite o nome do ninja: ");
                    String novoNinja = input.nextLine();
                    ninjaList.add(novoNinja);
                    System.out.println("Ninja adicionado com sucesso!");
                    break;

                case 2:
                    if (!ninjaList.isEmpty()) {
                        String removido = ninjaList.removeFirst();
                        System.out.println("Ninja removido: " + removido);
                    } else {
                        System.out.println("A lista está vazia.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de ninjas: " + ninjaList);
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        }

        input.close();
    }
}
