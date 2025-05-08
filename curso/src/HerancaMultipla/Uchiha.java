package HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {
    public void sharingan(){
        System.out.println(nome + " Ativou sharingan");
    }

    public void tacarChuriken() {
        System.out.println( nome + " taquei a shuriken");
    }

    @Override
    public void BaseAtak(){
        System.out.println(nome + " Usou Taijutsu Uchiha");
    }
}
