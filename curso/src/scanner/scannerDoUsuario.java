package scanner;

import java.util.Scanner;

public class scannerDoUsuario {

    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do seu ninja: ");

        String ninja = caixaDeTexto.nextLine();
        System.out.println("Nome: " + ninja);

        System.out.println("Digite a quantidade de missões: ");

        int missoes = caixaDeTexto.nextInt();
        System.out.println("Quantidade: " + missoes + " missões");

        if (missoes <= 10) {
            System.out.println("Esse ninja é bem inutil");
        } else {
            System.out.println("Esse ninja é aceitável");
        }
        caixaDeTexto.close();

    }
}
