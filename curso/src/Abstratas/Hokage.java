package Abstratas;

public abstract class Hokage {
    String nome;
    boolean vivo;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokage() {
    }
    public Hokage (String nome) {
        System.out.println(nome);
    }
    public Hokage(int idade) {
    }
    public abstract void sabedoriaDeHokage();

}
