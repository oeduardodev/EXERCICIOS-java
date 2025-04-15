package Interfaces;

public class Main {
    public static void main(String[] args) {
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.mostrarInfos();
        Hinata.mostrarJutsusHyuga();
        String intececcao = ("------------------");
        System.out.println(intececcao);
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto";
        Boruto.kharma();
        Boruto.mostrarJutsuUzumaki();
    }
}
