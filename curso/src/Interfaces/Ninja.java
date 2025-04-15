package Interfaces;

public class Ninja {
        String nome;
        String nivel;
        String status;
        String missao;
        String aldeia;
        int idade;

        public void mostrarInfos() {
            System.out.println("Nome: " + nome);
            System.out.println("Nivel: " + nivel);
            System.out.println("Status: " + status);
            System.out.println("Idade: " + idade);
            System.out.println("Missao: " + missao);
            System.out.println("Aldeia: " + aldeia);

        }
}
