    package Enum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exibirDetalhes();

        System.out.println(Arrays.toString(RankDeMissoes.values()) );
    }
}
