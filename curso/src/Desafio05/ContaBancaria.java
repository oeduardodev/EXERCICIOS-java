package Desafio05;

public abstract class ContaBancaria implements Conta {
    String nome;
    String numeroDaConta;
    double saldo;

    public ContaBancaria(String nome, String numeroDaConta, double saldo) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("seu saldo é de: " + saldo);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0)  {
            saldo +=valor;
        }else {
            System.out.println("Digite um valor válido");
        }
    }

    @Override
    public String toString() {
        return "Nome " + nome + " Numero da conta: " + numeroDaConta + " Saldo: " + saldo;
    }
}



