package Generics;

public class pergaminho {
    private int tamanho;

    public pergaminho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "pergaminho de tamanho: " + tamanho;
    }

}
