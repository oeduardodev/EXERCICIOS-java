package Construtores;

public class Main {
    public static void main(String[] args) {
        Hokage hashirama =  new Hokage();
        hashirama.nome = "Hashirama Senju";
        hashirama.idade = 43;

        Hokage tobirama = new Hokage("Tobirama Senju", 66, false);

        System.out.println(tobirama.nome);
        System.out.println(hashirama.nome);
    }
}
