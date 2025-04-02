package Objetos;

public class Ninja {
    String nome;
    String sexo;
    String aldeia;
    String rank;
    int missoes;
    int idade;

    public void sharinganAtivado() {
        System.out.println("SHARINGAN!");
    }

    public String welcomeNinja() {
        return "Bem-vindo, eu sou ninja ";
    }

    public int idadeMinimaHokage(int idadeMInima){
        return idadeMInima - idade;
    }


    public String academiaNinja(int idade, double notas, boolean exept) {
        if(idade > 8 && notas>7 || exept){
            return "se formou";
        }
        return "Não passou";
    }
}
