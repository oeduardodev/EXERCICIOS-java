package Objetos;

import java.util.Scanner;

public class objetos {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();

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

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto";
        Naruto.sexo = "male";
        Naruto.idade = 18;
        Naruto.missoes = 178;
        Naruto.rank = "unranked";
        Naruto.aldeia = "folha";
        Naruto.modoSabio();
        int idadeHokage = Naruto.idadeMinimaHokage(25);
        System.out.println("voce tem: " + Naruto.idade+" faltam: " + idadeHokage + " anos pra ser prefeito");

        String Formou = Naruto.academiaNinja(4,3.7,true);
        System.out.println(Formou);
        System.out.println(Naruto.nome);

        Ninja Gaara = new Ninja();

        Gaara.nome = "Gaara";
        Gaara.sexo = "male";
        Gaara.idade = 18;
        Gaara.missoes = 378;
        Gaara.rank = "Kazekage";
        Gaara.aldeia = "folha";
        int idadeHokageAreia = Gaara.idadeMinimaHokage(18);
        System.out.println("voce tem: " + Gaara.idade+" faltam: " + idadeHokageAreia + " anos pra ser prefeito");

        String gaaraFormou = Gaara.academiaNinja(16,3.7,true);
        System.out.println(gaaraFormou);
        System.out.println(Gaara.nome);
    }
}
