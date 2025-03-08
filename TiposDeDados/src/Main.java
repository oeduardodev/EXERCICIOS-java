import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        /*
         * Criação do Ninja
         *
         * */
        String name = "Naruto";
        int age = 16;
        String level = "Genin";
        String cla = "Uzumaki";
        String[] jutsus = {"clone das sombras", "rasenga", "Invocação"};
        char rank = 'S';
        long money = 50000000000L;

        System.out.println("Name: " + name + " " + name.getClass().getSimpleName());
        System.out.println("age: " + age + " " + ((Object) age).getClass().getSimpleName());
        System.out.println("level: " + level + " " + level.getClass().getSimpleName());
        System.out.println("cla: " + cla + " " + cla.getClass().getSimpleName());
        System.out.println("jutsus: " + Arrays.toString(jutsus) + " " + jutsus.getClass().getSimpleName());
        System.out.println("rank: " + rank + " " + ((Object) rank).getClass().getSimpleName());
        System.out.println("money: " + money + " " + ((Object) money).getClass().getSimpleName());

    }
}