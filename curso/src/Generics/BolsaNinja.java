package Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> itens = new ArrayList<>();

    public void setItens(T item) {
        itens.add(item);
        System.out.println("Ferramenta adicionada: " + item);
    }

    public void getItens() {
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
