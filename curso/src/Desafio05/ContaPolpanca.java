package Desafio05;

public class ContaPolpanca extends ContaBancaria {

    public ContaPolpanca() {
        super();
    }

    public ContaPolpanca(String nome, String numeroDaConta, double saldo) {
        super(nome, numeroDaConta, saldo);
    }


    @Override
    public void depositar(double valor) {
        saldo = saldo + valor - (valor * 0.01);
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }


}