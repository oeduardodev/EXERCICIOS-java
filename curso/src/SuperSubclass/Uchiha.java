package SuperSubclass;

public class Uchiha extends Ninja {
    public void tacarChuriken() {
        System.out.println("taquei a shuriken");
    }

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String clan, String patente){
        super(nome, patente, clan);
    }



    @Override
    public void BaseAtak(){
        System.out.println("Usou Taijutsu Uchiha");
    }



}
