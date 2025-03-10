package Condicionais;

public class    Condicionais {
    public static void main(String[] args) {
        /*
        * Condições if e else até ser hokage
        * */

        String ninja = "Neji Hiuga";
        int idade = 16;
        int missoes = 502;
        boolean hokage = false;

        if (missoes >= 50 && missoes < 100) {
            System.out.println("O ninja: " + ninja + " é Chunin");
        } else if (missoes >= 100 && missoes < 500) {
            System.out.println("O ninja: " + ninja + " é Jounin");
        } else if (missoes >= 500) {
            System.out.println("O ninja: " + ninja + " é Hokage");
        } else {
            System.out.println("O ninja: " + ninja + " é Genin");
        }
    }
}
