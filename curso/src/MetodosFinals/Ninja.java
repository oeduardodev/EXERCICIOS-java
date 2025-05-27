package MetodosFinals;

public class Ninja {
    // Método final que não pode ser sobrescrito
    public final void invocarKuchiyose() {
        System.out.println("Invocando Sapo no Jutsu!");
    }

    // Método que pode ser sobrescrito
    public void usarJutsu() {
        System.out.println("Usando jutsu genérico...");
    }
}
