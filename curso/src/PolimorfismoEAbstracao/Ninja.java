package PolimorfismoEAbstracao;

public abstract class Ninja implements EstiloDeLuta {
        String nome;
        int idade;
        String patente;
        String Clan;

        public void BaseAtakArm() {
            System.out.println("Lançou Kunai");
        }
        public void BaseAtak(){
            System.out.println("Usou Taijutsu");
        }

        @Override
        public void estiloDeLuta(){
            System.out.println("estrategico");
        };

}
