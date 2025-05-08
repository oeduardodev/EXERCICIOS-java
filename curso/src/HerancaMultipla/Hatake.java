package HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface {
    public void hello(){
        System.out.println(nome + " Eu sou um Hatake");
    }
    public void sharingan(){
        System.out.println(nome + " Ativou sharingan");
    }
    public void AmbuHello(){
        System.out.println(nome + " Ninja de Elite Ambu");
    }

}
