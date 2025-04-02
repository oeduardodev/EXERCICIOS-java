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
        Sasuke.aldeia = "folha";
        Sasuke.sharinganAtivado();
        String message =  Sasuke.welcomeNinja();
        System.out.println(message);
        System.out.println(Sasuke.nome);

        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto";
        Naruto.sexo = "male";
        Naruto.idade = 18;
        Naruto.missoes = 178;
        Naruto.rank = "Hokage";
        Naruto.aldeia = "folha";
        int idadeHokage = Naruto.idadeMinimaHokage(25);
        System.out.println("voce tem: " + Naruto.idade+" faltam: " + idadeHokage + " anos pra ser prefeito");

        String Formou = Naruto.academiaNinja(4,3.7,true);
        System.out.println(Formou);
        System.out.println(Naruto.nome);
    }
}
