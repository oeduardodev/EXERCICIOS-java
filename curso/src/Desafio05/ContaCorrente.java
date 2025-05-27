package Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(String nome, String numeroDaConta, double saldo) {
        super(nome, numeroDaConta, saldo);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();

    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

}

