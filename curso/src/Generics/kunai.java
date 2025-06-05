package Generics;

public class kunai {
    private String descricao;

    public kunai(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return descricao;
    }

    @Override
    public String toString() {
        return "kunai: " + descricao;
    }

}
