package switchEndCases;

import java.util.Scanner;

public class switchEndCases {
    public static void main(String[] args) {
        Scanner caixaNinja = new Scanner(System.in);

        System.out.println("Escolha um aktsuki:");
        System.out.println("1 - Deidara");
        System.out.println("2 - Kisame");
        System.out.println("3 - Pain");

        int escolha = caixaNinja.nextInt();
        System.out.println("voce escolheu " + escolha);

        switch (escolha) {
            case 1:
                System.out.println("Voce escolheu o explosivo");
                break;
            case 2:
                System.out.println("Voce escolheu o tubarao");
                break;
            case 3:
                System.out.println("Voce escolheu a dor");
                break;
            default:
                System.out.println("Opçao invalida");
        }
        caixaNinja.close();
    }
}
