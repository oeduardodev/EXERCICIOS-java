package Ternarios;

public class ternarios {
    public static void main(String[] args) {
        short numeroMissoes = 7;
        String nivel = (numeroMissoes >= 10) ? "Esse ninja tem 10 ou mais missoes" : "esse ninja tem menos de 10 missões";
        System.out.println(nivel);
    }
}
