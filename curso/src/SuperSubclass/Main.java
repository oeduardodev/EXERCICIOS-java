package SuperSubclass;

public class Main {
    public static void main(String[] args) {

        Uchiha itachi = new Uchiha();
        itachi.BaseAtak();
        itachi.estiloDeLuta();

        Uchiha sasuke = new Uchiha("Sasuke", "Uchiha", "Ambu");
        sasuke.BaseAtak();
        sasuke.estiloDeLuta();

    }

}
