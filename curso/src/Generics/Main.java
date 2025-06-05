package Generics;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.setItens(new kunai("Kunai de treino"));
        bolsaNinja.setItens(new shuriken("shuriken real"));
        bolsaNinja.setItens(new pergaminho(3));

        bolsaNinja.getItens();
    }
}
