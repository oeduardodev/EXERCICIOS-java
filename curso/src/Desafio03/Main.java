package Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorNinja = new Scanner(System.in);

        Uchiha ninja = new Uchiha();

        System.out.println("Digite o nome do seu ninja: ");
        ninja.nome = leitorNinja.nextLine();
        System.out.println("Digite a idade do seu ninja: ");
        ninja.idade = leitorNinja.nextInt();
        leitorNinja.nextLine();
        System.out.println("Digite o nivel da Missão: ");
        ninja.nivel = leitorNinja.nextLine();
        System.out.println("Digite o status da Missão: ");
        ninja.status = leitorNinja.nextLine();
        System.out.println("Digite o missao do seu ninja: ");
        ninja.missao = leitorNinja.nextLine();

        leitorNinja.close();

        ninja.mustrarJutsus();

        ninja.mostrarInfos();
    }
}
