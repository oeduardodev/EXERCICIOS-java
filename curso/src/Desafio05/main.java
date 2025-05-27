package Desafio05;

public class main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Naruto", "12345-6", 1000.0);
        conta.consultarSaldo();
        conta.depositar(500);
        conta.consultarSaldo();
        System.out.println(conta);
        System.out.println(conta.numeroDaConta);;
    }
}
