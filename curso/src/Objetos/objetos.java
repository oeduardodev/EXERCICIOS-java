package Objetos;

import java.util.Scanner;

public class objetos {
    public static void main(String[] args) {
        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke";
        Sasuke.sexo = "male";
        Sasuke.idade = 18;
        Sasuke.missoes = 43;
        Sasuke.rank = "unukenin";

        System.out.println(Sasuke.nome);

        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto";
        Naruto.sexo = "male";
        Naruto.idade = 18;
        Naruto.missoes = 178;
        Naruto.rank = "Hokage";

        System.out.println(Naruto.nome);
    }
}
