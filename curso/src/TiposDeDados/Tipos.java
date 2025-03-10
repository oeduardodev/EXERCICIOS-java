package TiposDeDados;

import java.util.Arrays;

public class Tipos {

    public static void main(String[] args) {

        /*
         * Dados primitivos
         *
         * */
        int age = 16;
        char rank = 'S';
        long money = 50000000000L;
        boolean live = true;

        /*
         * Dados não primitivos
         *
         * */
        String name = "Naruto";
        String nameUpperCaseFistLetra = name.substring(0, 1).toUpperCase() + name.substring(1);
        String level = "Genin";
        String cla = "Uzumaki";
        String claUpperCase = cla.toUpperCase();
        String[] jutsus = {"clone das sombras", "rasenga", "Invocação"};

        /*
         * Imprime dados
         *
         * */
        System.out.println("Name: " + nameUpperCaseFistLetra + " " + nameUpperCaseFistLetra.getClass().getSimpleName());
        System.out.println("age: " + age + " " + ((Object) age).getClass().getSimpleName());
        System.out.println("level: " + level + " " + level.getClass().getSimpleName());
        System.out.println("cla: " + claUpperCase + " " + claUpperCase.getClass().getSimpleName());
        System.out.println("jutsus: " + Arrays.toString(jutsus) + " " + jutsus.getClass().getSimpleName());
        System.out.println("rank: " + rank + " " + ((Object) rank).getClass().getSimpleName());
        System.out.println("money: " + money + " " + ((Object) money).getClass().getSimpleName());
        System.out.println("live: " + live + " " + ((Object) live).getClass().getSimpleName());

    }

}
