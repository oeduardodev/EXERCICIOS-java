package SuperSubclass;

public abstract class Ninja implements EstiloDeLuta {
        String nome;
        int idade;
        String patente;
        String clan;

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

        public Ninja(){}
        public Ninja(String nome, String patente, String clan){
            this.nome = nome;
            this.patente = patente;
            this.clan = clan;
        }


}
