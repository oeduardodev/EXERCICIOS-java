package Desafio04;

public class Main {
    public static void main(String[] args) {
        // criação do ninja básico com construtor padrão
        NinjaBase iruka = new NinjaBase();
        iruka.nome = "Iruka Umino";
        iruka.idade = 27;
        iruka.patente = "Chuuin";
        iruka.habilidade = "Jutsu de Invocação";

        iruka.mostrarInformacoes();
        iruka.executarHabilidade();

        System.out.println( );

        // criação do ninja básico com construtor sem uma especialidade
        NinjaBase naruto = new NinjaBase("Naruto Uzumaki", 17, "Genin", "Rasengan");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        System.out.println( );

        // criação do ninja avançado com construtor padrão
        NinjaAdvanced rocklee = new NinjaAdvanced();
        rocklee.nome = "Rock Lee";
        rocklee.idade = 20;
        rocklee.patente = "Jounin";
        rocklee.habilidade = "Oito portões";
        rocklee.especialidade = Desafio04.Especialidade.Taijutsu;

        rocklee.mostrarInformacoes();
        rocklee.executarHabilidade();

        System.out.println( );

        // criação do ninja avançado com a especialidade em um tipo de habilidade
        NinjaAdvanced sasuke = new NinjaAdvanced("Sasuke Uchiha", 18, "Chunin", "Chidori", Desafio04.Especialidade.Ninjutsu);
        sasuke.mostrarInformacoes();
        sasuke.executarHabilidade();
    }
}
