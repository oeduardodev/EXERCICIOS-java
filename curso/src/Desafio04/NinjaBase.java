package Desafio04;

public class NinjaBase implements Ninjas{
    String nome, patente, habilidade;
    int idade;

    public NinjaBase () {

    }

    public NinjaBase(String nome, int idade, String patente, String habilidade) {
        this.habilidade = habilidade;
        this.idade = idade;
        this.nome = nome;
        this.patente = patente;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("----------RG NINJA----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Patente: " + this.patente);
        System.out.println("Habilidade: " + this.habilidade);
        System.out.println("----------------------------");
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + this.nome + " executou a habilidade: " + this.habilidade);
    }
}
