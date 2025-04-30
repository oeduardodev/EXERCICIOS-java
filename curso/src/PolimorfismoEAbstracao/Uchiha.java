package PolimorfismoEAbstracao;

public class Uchiha extends Ninja {
    public void tacarChuriken() {
        System.out.println("taquei a shuriken");
    }



    @Override
    public void BaseAtak(){
        System.out.println("Usou Taijutsu Uchiha");
    }



}
