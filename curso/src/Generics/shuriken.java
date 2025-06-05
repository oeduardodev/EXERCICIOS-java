package Generics;

public class shuriken {
    private String tipo;

    public shuriken(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Shuriken de tipo: " + tipo;
    }

}
